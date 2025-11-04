package practice3;

public class conversion {
    public static void main(String[] args) {
        int i = 130;
        byte b = (byte) i; // int -> byte (значение выйдет за пределы byte)
        System.out.println("int i = " + i + " -> byte b = " + b);

        double d = 3.99;
        int n = (int) d; // double -> int (отбрасывание дробной части)
        System.out.println("double d = " + d + " -> int n = " + n);
    }
}