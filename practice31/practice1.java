package practice31;

public class practice1 {
    public static void main(String[] args) {

        String text = "Hello World";

        // 1. length() — длина строки
        System.out.println("1. length(): " + text.length());

        // 2. charAt() — символ по индексу
        System.out.println("2. charAt(1): " + text.charAt(1));

        // 3. substring() — подстрока
        System.out.println("3. substring(0, 5): " + text.substring(0, 5));

        // 4. equals() — посимвольное сравнение
        System.out.println("4. equals(\"Hello World\"): " + text.equals("Hello World"));

        // 5. equalsIgnoreCase() — сравнение без учёта регистра
        System.out.println("5. equalsIgnoreCase(\"hello world\"): " + text.equalsIgnoreCase("hello world"));

        // 6. indexOf() — поиск подстроки
        System.out.println("6. indexOf(\"World\"): " + text.indexOf("World"));

        // 7. contains() — содержит ли подстроку
        System.out.println("7. contains(\"lo Wo\"): " + text.contains("lo Wo"));

        // 8. startsWith() — начинается ли строка с...
        System.out.println("8. startsWith(\"Hell\"): " + text.startsWith("Hell"));

        // 9. endsWith() — заканчивается ли строка на...
        System.out.println("9. endsWith(\"World\"): " + text.endsWith("World"));

        // 10. toUpperCase() и toLowerCase() — изменение регистра
        System.out.println("10. toUpperCase(): " + text.toUpperCase());
        System.out.println("    toLowerCase(): " + text.toLowerCase());
    }
}
