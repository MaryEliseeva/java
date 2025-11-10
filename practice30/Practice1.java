package practice30;

interface MyInterface {
    default void sayHello() {
        System.out.println("Hello");
    }

    static void staticMethod() {
        System.out.println("Static");
    }
}

class MyClass implements MyInterface {
    @Override
    public void sayHello() {
        System.out.println("Hello, world");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.sayHello();
        MyInterface.staticMethod();
    }
}
