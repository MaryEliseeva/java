public class practice35 {
    public static void main(String[] args) {
        try {
            int x = 5 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Исключение: " + e);
        }

        String s = null;
        s.length(); // NullPointerException
    }
}
