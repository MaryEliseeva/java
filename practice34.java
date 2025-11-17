public class practice34 {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException поймана: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[3];
            int y = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException поймана");
        }

        // IllegalArgumentException
        try {
            Thread.sleep(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException поймана");
        } catch (InterruptedException ignored) {}

        // ClassCastException
        try {
            Object obj = "string";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException поймана");
        }

        // NullPointerException
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException поймана");
        }
    }
}
