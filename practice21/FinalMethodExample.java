class Parent {
    public final void showMessage() {
        System.out.println("A");
    }
}

class Child extends Parent {
    // Ошибка: нельзя переопределить final-метод
    // @Override
    // public void showMessage() {
    //     System.out.println("B");
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.showMessage();
    }
}
