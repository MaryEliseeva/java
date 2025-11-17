class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class practice36 {
    public static void main(String[] args) {
        handleMultipleExceptions();
        handleHierarchyExceptions();
    }

    public static void handleMultipleExceptions() {
        try {
            int[] arr = new int[3];
            arr[10] = 5;// ArrayIndexOutOfBoundsException
            Object x = null;
            x.toString();// NullPointerException

        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Ошибка доступа к данным: " + e.getClass().getSimpleName());
        }
    }
    
    public static void handleHierarchyExceptions() {
        try {
            throw new Ex3();

        } catch (Ex3 e) {
            System.out.println("Перехвачено Ex3");

        } catch (Ex2 e) {
            System.out.println("Перехвачено Ex2");

        } catch (Ex1 e) {
            System.out.println("Перехвачено Ex1");
        }
    }
}
