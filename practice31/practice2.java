package practice31;
import java.util.StringJoiner;

public class practice2 {
    public static void main(String[] args) {

        // простое объединение строк
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Apple");
        joiner1.add("Banana");
        joiner1.add("Orange");
        System.out.println(joiner1);
        // Apple, Banana, Orange

        //сбор строки в цикле
        StringJoiner joiner3 = new StringJoiner(" | ");
        for (int i = 1; i <= 5; i++) {
            joiner3.add("Item" + i);
        }
        System.out.println(joiner3);
        // Item1 | Item2 | Item3 | Item4 | Item5

        //объединение значений массива
        String[] arr = {"Apple", "Banana", "Orange"};
        StringJoiner joiner4 = new StringJoiner(" + ");
        for (String s : arr) {
            joiner4.add(s);
        }
        System.out.println(joiner4);
        // Apple + Banana + Orange
    }
}