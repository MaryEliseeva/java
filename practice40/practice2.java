package practice40;

import java.io.FileOutputStream;
import java.io.IOException;

public class practice2 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("practice40/test_output.txt")) {
            String text = "Hello123";
            System.out.println("Запись в файл по одному байту:");
            for (int i = 0; i < text.length(); i++) {
                int byteValue = text.charAt(i);
                fos.write(byteValue);
                System.out.print((char) byteValue + "(" + byteValue + ") ");
            }
            System.out.println("\nДанные записаны в файл");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
        }
    }
}