package practice30;

interface InterfaceA {
    default void show() {
        System.out.println("Interface1");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("Interface2");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void show() {
        // Можно выбрать реализацию одного из интерфейсов
        InterfaceA.super.show();
        // Или написать свою
        System.out.println("MyClass implementation");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show(); 
    }
}
