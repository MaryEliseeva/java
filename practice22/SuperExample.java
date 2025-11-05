package practice22;

class Parent {
    protected String name = "Родитель";

    public Parent(String text) {
        System.out.println("Конструктор суперкласса: " + text);
    }

    public void showMessage() {
        System.out.println("Метод суперкласса: " + name);
    }
}

class Child extends Parent {
    private String name = "Потомок";

    public Child() {
        // Вызов конструктора суперкласса
        super("Передано из подкласса");

        System.out.println("Конструктор подкласса");
    }

    public void display() {
        // Доступ к полю суперкласса
        System.out.println("Имя суперкласса: " + super.name);

        // Вызов метода суперкласса
        super.showMessage();

        System.out.println("Имя подкласса: " + this.name);
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
