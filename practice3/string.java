package practice3;

public class string {
    public static void main(String[] args) {
        String str = "Результат: ";
        int number = 10; // базовый тип
        double value = 3.14; // базовый тип
        boolean flag = true; // базовый тип
        char letter = 'X'; // базовый тип
        Integer obj = 42; // объект-оболочка

        // Примеры использования перегруженного оператора +
        System.out.println(str + number); // String + int
        System.out.println(str + value); // String + double
        System.out.println(str + flag); // String + boolean
        System.out.println(str + letter); // String + char
        System.out.println(str + obj); // String + объект Integer

        // Комбинация нескольких типов
        System.out.println(str + number + ", " + value + ", " + flag + ", " + letter + ", " + obj);
    }
}