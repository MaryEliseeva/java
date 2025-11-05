// Класс объявлен final, наследование запрещено
final class FinalClass {
    public void sayHello() {
        System.out.println("Hello");
    }
}
// Ошибка
// class Child extends FinalClass { }

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.sayHello();
    }
}
