package practice3;

public class TypePromotion {
    public static void main(String[] args) {
        int a1 = 5;
        double b3 = 2.5;
        double res1 = a1 + b3;
        System.out.println("int + double = " + res1 + " (результат типа double)");

        byte x = 10;
        int y = 20;
        int res2 = x + y;
        System.out.println("byte + int = " + res2 + " (результат типа int)");

        float f = 3.5f;
        long l = 2L;
        float res3 = f + l;
        System.out.println("float + long = " + res3 + " (результат типа float)");

        short sA = 5;
        short sB = 10;
        int res4 = sA + sB; // short + short = int
        System.out.println("short + short = " + res4 + " (результат типа int)");

        char ch = 'A'; // 65
        int num = 5;
        int res5 = ch + num;
        System.out.println("char + int = " + res5 + " (результат типа int, т.к. 'A' имеет код 65)");
    }
}