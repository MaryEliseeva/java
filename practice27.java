interface ExampleInterface {
    class Helper {
        public void showMessage() {
            System.out.println("А");
        }
    }
}

public class practice27 {
    public static void main(String[] args) {
        ExampleInterface.Helper helper = new ExampleInterface.Helper();
        helper.showMessage();
    }
}
