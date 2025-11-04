package practice3;

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte b1 = 0, b2 = 100;
        short s1 = 0, s2 = 20000;
        int i1 = 0, i2 = 123456;
        long l1 = 0L, l2 = 12345678900L;
        float f1 = 0.0f, f2 = 3.14f;
        double d1 = 0.0, d2 = 2.718281828;
        char c1 = '\u0000', c2 = 'A', c3 = 'Ж';
        boolean bool1 = false, bool2 = true;

        System.out.println(
                "byte: " + b1 + ", " + b2 + " | " +
                        "short: " + s1 + ", " + s2 + " | " +
                        "int: " + i1 + ", " + i2 + " | " +
                        "long: " + l1 + ", " + l2 + " | " +
                        "float: " + f1 + ", " + f2 + " | " +
                        "double: " + d1 + ", " + d2 + " | " +
                        "char: '" + c1 + "', '" + c2 + "', '" + c3 + "' | " +
                        "boolean: " + bool1 + ", " + bool2);
    }
}