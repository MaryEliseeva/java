package practice32;

public class Practice1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        // append — добавляет в конец
        sb.append(" World");
        // insert — вставляет по индексу
        sb.insert(5, ",");
        // delete — удаляет диапазон
        sb.delete(5, 6);
        // replace — заменяет диапазон
        sb.replace(0, 5, "Hi");
        // reverse — переворачивает строку
        sb.reverse();
        // length — длина строки
        int length = sb.length();
        // capacity — текущая вместимость
        int capacity = sb.capacity();
        // ensureCapacity — увеличивает вместимость
        sb.ensureCapacity(50);
        // charAt — возвращает символ по индексу
        char ch = sb.charAt(0);
        // setCharAt — заменяет символ
        sb.setCharAt(0, 'X');
        System.out.println("StringBuilder результат: " + sb);


        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Rocks");
        sbf.insert(4, "!");
        sbf.deleteCharAt(4);
        sbf.reverse();
        System.out.println("StringBuffer результат: " + sbf);

    }
}
