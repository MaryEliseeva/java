package practice6;

public class BooleanCreation {
    public static void main(String[] args) {
        // --- Практика #2 ---
        Boolean b1 = Boolean.valueOf(true);          // через valueOf(boolean)
        Boolean b2 = Boolean.valueOf("true");       // через valueOf(String)
        Boolean b3 = true;                           // автоупаковка
        Boolean b4 = Boolean.parseBoolean("TRUE");  // через parseBoolean

        System.out.println(b1);  
        System.out.println(b2);  
        System.out.println(b3);  
        System.out.println(b4);  
    }
}