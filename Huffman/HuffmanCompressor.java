import java.io.*;
import java.nio.file.Files;
import java.util.*;

class TreeElement {
    private Character symbol; 
    private final int weight;
    private TreeElement left;
    private TreeElement right;

    public TreeElement(Character symbol, int weight) {
        this.symbol = symbol;
        this.weight = weight;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public Character getSymbol() { return symbol; }
    public void setSymbol(Character symbol) { this.symbol = symbol; }

    public int getWeight() { return weight; }
    public TreeElement getLeft() { return left; }
    public TreeElement getRight() { return right; }
    
    public void setChildren(TreeElement left, TreeElement right) {
        this.left = left;
        this.right = right;
    }
}

class HuffmanProcessor {
    private Map<Character, String> codeTable;
    private TreeElement root;

    public HuffmanProcessor() {
        codeTable = new TreeMap<>();
    }

    private Map<Character, Integer> calculateFrequencies(byte[] data) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (byte b : data) {
            char c = (char) (b & 0xFF);
            freq.merge(c, 1, Integer::sum);
        }
        return freq;
    }

    private TreeElement buildTree(Map<Character, Integer> freq) {
        PriorityQueue<TreeElement> pq = new PriorityQueue<>(Comparator.comparingInt(TreeElement::getWeight));
        freq.forEach((c, w) -> pq.offer(new TreeElement(c, w)));

        while (pq.size() > 1) {
            TreeElement t1 = pq.poll();
            TreeElement t2 = pq.poll();
            TreeElement parent = new TreeElement(null, t1.getWeight() + t2.getWeight());
            parent.setChildren(t1, t2);
            pq.offer(parent);
        }
        return pq.poll();
    }

    private void generateCodes(TreeElement node, String code) {
        if (node == null) return;
        if (node.isLeaf()) {
            codeTable.put(node.getSymbol(), code.isEmpty() ? "0" : code);
            return;
        }
        generateCodes(node.getLeft(), code + "0");
        generateCodes(node.getRight(), code + "1");
    }

    private byte[] loadFile(String path) throws IOException {
        return Files.readAllBytes(new File(path).toPath());
    }

    private void saveFile(String path, String content) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
            pw.print(content);
        }
    }

    private void saveHuffmanFile(String path, String compressed, Map<Character,String> table) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
            pw.println(compressed);
            pw.println("TABLE");
            table.forEach((c, code) -> pw.println((int)c + ":" + code));
        }
    }

    private Map<Character,String> loadTable(List<String> lines, int start) {
        Map<Character,String> table = new HashMap<>();
        for (int i = start; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(":");
            char c = (char) Integer.parseInt(parts[0]);
            table.put(c, parts[1]);
        }
        return table;
    }

    private TreeElement rebuildTree(Map<Character,String> table) {
        TreeElement r = new TreeElement(null, 0);
        for (Map.Entry<Character,String> e : table.entrySet()) {
            Character c = e.getKey();
            String code = e.getValue();
            TreeElement cur = r;
            for (char bit : code.toCharArray()) {
                if (bit == '0') {
                    if (cur.getLeft() == null) cur.setChildren(new TreeElement(null,0), cur.getRight());
                    cur = cur.getLeft();
                } else {
                    if (cur.getRight() == null) cur.setChildren(cur.getLeft(), new TreeElement(null,0));
                    cur = cur.getRight();
                }
            }
            cur.setSymbol(c);
        }
        return r;
    }

    private String compress(byte[] data) {
        StringBuilder sb = new StringBuilder();
        for (byte b : data) sb.append(codeTable.get((char)(b & 0xFF)));
        return sb.toString();
    }

    private String decompress(String compressed, TreeElement r) {
        StringBuilder sb = new StringBuilder();
        TreeElement cur = r;
        for (char bit : compressed.toCharArray()) {
            cur = (bit == '0') ? cur.getLeft() : cur.getRight();
            if (cur.isLeaf()) {
                sb.append(cur.getSymbol());
                cur = r;
            }
        }
        return sb.toString();
    }

    public void encode(String inputFile, String outputFile) throws IOException {
        byte[] data = loadFile(inputFile);
        Map<Character,Integer> freq = calculateFrequencies(data);
        root = buildTree(freq);
        generateCodes(root, "");
        String compressed = compress(data);
        saveHuffmanFile(outputFile, compressed, codeTable);
        System.out.println("Кодирование завершено успешно");
    }

    public void decode(String inputFile, String outputFile) throws IOException {
        List<String> lines = Files.readAllLines(new File(inputFile).toPath());
        String compressed = lines.get(0);
        int tableStart = lines.indexOf("TABLE") + 1;
        Map<Character,String> table = loadTable(lines, tableStart);
        root = rebuildTree(table);
        String decoded = decompress(compressed, root);
        saveFile(outputFile, decoded);
        System.out.println("Декодирование завершено успешно");
    }
}

public class HuffmanCompressor {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Использование: java HuffmanCompressor <encode/decode> <входной файл> <выходной файл>");
            return;
        }
        String mode = args[0];
        String input = args[1];
        String output = args[2];

        HuffmanProcessor proc = new HuffmanProcessor();
        try {
            if (mode.equalsIgnoreCase("encode")) proc.encode(input, output);
            else if (mode.equalsIgnoreCase("decode")) proc.decode(input, output);
            else System.out.println("Неверный режим: encode или decode");
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
