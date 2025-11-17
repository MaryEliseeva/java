class MyFirstException extends Exception {

    public MyFirstException() {
        super("исключение MyFirstException");
    }

    public MyFirstException(String message) {
        super(message);
    }

    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class practice37 {
    public static void main(String[] args) {
        try {
            testMethod(-5);
        } catch (MyFirstException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }

    }

    public static void testMethod(int value) throws MyFirstException {
        if (value < 0) {
            throw new MyFirstException("Число не может быть отрицательным: " + value);
        }
        System.out.println("Число корректное: " + value);
    }
}
