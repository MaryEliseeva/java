package practice6;

public class NullUnboxingExample {
    public static void main(String[] args) {
        // Исключение NullPointerException возникает при автораспаковке null-объекта
        
        Integer i = null;
        
        try {
            int j = i;  // попытка автораспаковки null -> NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught при unboxing null");
        }
    }
}