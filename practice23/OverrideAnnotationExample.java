package practice23;

class Parent {
    public void showMessage() {
        System.out.println("A");
    }
}

class Child extends Parent {
    // Ошибка в названии метода — Override поможет это заметить
    // @Override
    // public void showMesage() {  // опечатка
    //     System.out.println("B");
    // }

    @Override
    public void showMessage() {
        System.out.println("B");
    }
}

public class OverrideAnnotationExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.showMessage();
    }
}
