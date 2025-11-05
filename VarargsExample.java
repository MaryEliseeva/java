public class VarargsExample {

    public static void printItems(int... numbers) {
        System.out.println("Вывод чисел:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    // Перегруженный метод для строк
    public static void printItems(String... texts) {
        System.out.println("Вывод строк:");
        for (String text : texts) {
            System.out.print(text + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        printItems(1, 2, 3, 4);// вызывает метод с int...
        printItems("Привет", "мир", "!");// вызывает метод с String...
    }
}
