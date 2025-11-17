package practice40;

import java.io.FileInputStream;
import java.io.IOException;

public class practice1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("practice40/test_input.txt")) {
            int data;
            System.out.println("Чтение файла по одному байту:");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data + "(" + data + ") ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
// вывод: A(65) B(66) C(67) a(97) b(98) c(99) 1(49) 2(50) 3(51)