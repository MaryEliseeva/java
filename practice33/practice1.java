package practice33;

import java.util.Formatter;
import java.util.Date;

public class practice1 {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("Целое число: %d%n", 42);         // %d — целое число
        f.format("Вещественное число: %f%n", 3.14); // %f — число с плавающей точкой
        f.format("Строка: %s%n", "Hello");         // %s — строка
        f.format("Булево: %b%n", true);            // %b — логическое значение
        f.format("Символ: %c%n", 'A');             // %c — символ

        System.out.println(f.toString());
        f.close();
    }
}
