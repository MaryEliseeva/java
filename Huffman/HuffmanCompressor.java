import java.io.*;
import java.util.*;

class TreeElement {
    private final Character symbol;
    private final Integer weight;
    private TreeElement leftChild;
    private TreeElement rightChild;

    public TreeElement(Character symbol, Integer weight) {
        this.symbol = symbol;
        this.weight = weight;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void setChildren(TreeElement left, TreeElement right) {
        this.leftChild = left;
        this.rightChild = right;
    }

    public boolean isTerminal() {
        return leftChild == null && rightChild == null;
    }

    public Character getSymbol() { return symbol; }
    public Integer getWeight() { return weight; }
    public TreeElement getLeft() { return leftChild; }
    public TreeElement getRight() { return rightChild; }
}

class HuffmanProcessor {
    private Map<Character, String> codeTable;
    private TreeElement treeRoot;

    public HuffmanProcessor() {
        this.codeTable = new TreeMap<>();
    }

    //Построение дерева кодирования
    private TreeElement constructTree(String inputText) {
        Map<Character, Integer> frequencies = calculateFrequencies(inputText);

        Queue<TreeElement> heap = new PriorityQueue<>(Comparator.comparingInt(TreeElement::getWeight));

        frequencies.forEach((chr, count) -> heap.offer(new TreeElement(chr, count)));

        while (heap.size() > 1) {
            TreeElement first = heap.poll();
            TreeElement second = heap.poll();

            TreeElement parent = new TreeElement(null, first.getWeight() + second.getWeight());
            parent.setChildren(first, second);
            heap.offer(parent);
        }

        return heap.poll();
    }

    private Map<Character, Integer> calculateFrequencies(String text) {
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            result.merge(current, 1, Integer::sum);
        }
        return result;
    }

    private void generateCodes(TreeElement node, String code) {
        if (node != null) {
            if (node.isTerminal()) {
                String finalCode = code.isEmpty() ? "0" : code;
                codeTable.put(node.getSymbol(), finalCode);
                return;
            }

            generateCodes(node.getLeft(), code + "0");
            generateCodes(node.getRight(), code + "1");
        }
    }

    // Кодирование файла
    public void encodeFile(String sourceFile, String targetFile) throws IOException {
        String content = loadTextFromFile(sourceFile);
        if (content.isEmpty()) {
            System.out.println("Файл пустой");
            return;
        }

        treeRoot = constructTree(content);
        generateCodes(treeRoot, "");

        String compressed = compressText(content);
        saveResults(targetFile, compressed);
        System.out.println("Кодирование завершено успешно");
    }

    private String compressText(String original) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < original.length(); i++) {
            result.append(codeTable.get(original.charAt(i)));
        }
        return result.toString();
    }

    private String loadTextFromFile(String path) throws IOException {
        StringBuilder content = new StringBuilder();
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine());
            }
        }
        return content.toString();
    }

    private void saveResults(String path, String compressed) throws IOException {
        try (PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(path)))) {
            // Сжатые данные
            output.println(compressed);

            // Таблица кодов
            output.println("ТАБЛИЦА КОДИРОВАНИЯ");
            codeTable.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(entry -> output.printf("'%c' -> %s%n", entry.getKey(), entry.getValue()));
        }
    }

    //Декодирование файла
    public void decodeFile(String sourceFile, String targetFile) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        if (lines.isEmpty()) {
            System.out.println("Файл пустой");
            return;
        }

        // Разделяем кодированные данные и таблицу
        String compressedData = lines.get(0);
        Map<Character, String> decodingTable = new HashMap<>();
        for (int i = 1; i < lines.size(); i++) {
            String entry = lines.get(i);
            if (entry.contains("->")) {
                String[] parts = entry.split("->");
                char key = parts[0].trim().replace("'", "").charAt(0);
                String value = parts[1].trim();
                decodingTable.put(key, value);
            }
        }

        // Восстанавливаем дерево по таблице
        treeRoot = rebuildTree(decodingTable);

        String decodedText = decompressText(compressedData, treeRoot);

        try (PrintWriter writer = new PrintWriter(new FileWriter(targetFile))) {
            writer.print(decodedText);
        }

        System.out.println("Декодирование завершено успешно");
    }

    private TreeElement rebuildTree(Map<Character, String> table) {
        TreeElement root = new TreeElement(null, 0);
        for (Map.Entry<Character, String> entry : table.entrySet()) {
            Character symbol = entry.getKey();
            String code = entry.getValue();
            TreeElement current = root;
            for (char c : code.toCharArray()) {
                if (c == '0') {
                    if (current.getLeft() == null)
                        current.setChildren(new TreeElement(null,0), current.getRight());
                    current = current.getLeft();
                } else {
                    if (current.getRight() == null)
                        current.setChildren(current.getLeft(), new TreeElement(null,0));
                    current = current.getRight();
                }
            }
            // Достигли листа
            current.setChildren(null, null);
            try {
                java.lang.reflect.Field symbolField = TreeElement.class.getDeclaredField("symbol");
                symbolField.setAccessible(true);
                symbolField.set(current, symbol);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return root;
    }

    private String decompressText(String compressed, TreeElement root) {
        StringBuilder result = new StringBuilder();
        TreeElement current = root;
        for (char bit : compressed.toCharArray()) {
            current = (bit == '0') ? current.getLeft() : current.getRight();
            if (current.isTerminal()) {
                result.append(current.getSymbol());
                current = root;
            }
        }
        return result.toString();
    }
}

public class HuffmanCompressor {
    public static void main(String[] arguments) {
        if (arguments.length < 3) {
            System.out.println("Использование: java HuffmanCompressor <encode/decode> <входной файл> <выходной файл>");
            return;
        }

        String mode = arguments[0];
        String input = arguments[1];
        String output = arguments[2];

        HuffmanProcessor processor = new HuffmanProcessor();

        try {
            if (mode.equalsIgnoreCase("encode")) {
                processor.encodeFile(input, output);
            } else if (mode.equalsIgnoreCase("decode")) {
                processor.decodeFile(input, output);
            } else {
                System.out.println("Неверный режим. Используйте encode или decode.");
            }
        } catch (IOException e) {
            System.err.println("Ошибка работы с файлом: " + e.getMessage());
        }
    }
}
