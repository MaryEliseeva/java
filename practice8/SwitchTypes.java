package practice8;

public class SwitchTypes {
    enum Day { MONDAY, TUESDAY }

    public static void main(String[] args) {

        // 1) int
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("int: a is 1");
                break;
            case 2:
                System.out.println("int: a is 2");
                break;
        }

        // 2) byte
        byte b = 1;
        switch (b) {
            case 0:
                System.out.println("byte: b is 0");
                break;
            case 1:
                System.out.println("byte: b is 1");
                break;
        }

        // 3) short
        short s = 2;
        switch (s) {
            case 1:
                System.out.println("short: s is 1");
                break;
            case 2:
                System.out.println("short: s is 2");
                break;
        }

        // 4) char
        char c = 'A';
        switch (c) {
            case 'A':
                System.out.println("char: c is A");
                break;
            case 'B':
                System.out.println("char: c is B");
                break;
        }

        // 5) String
        String color = "Red";
        switch (color) {
            case "Red":
                System.out.println("String: color is Red");
                break;
            case "Green":
                System.out.println("String: color is Green");
                break;
        }

        // 6) enum
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("enum: Today is Monday");
                break;
            case TUESDAY:
                System.out.println("enum: Today is Tuesday");
                break;
        }
    }
}