public class Overloading {

    // Метод без параметров
    void sayHello() {
        System.out.println("Привет!");
    }

    // Перегрузка метода: один параметр
    void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // Ещё одна перегрузка: два параметра
    void sayHello(String name, int age) {
        System.out.println("Привет, " + name + "! Ваш возраст  " + age + " лет.");
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        obj.sayHello();
        obj.sayHello("А");
        obj.sayHello("B", 20);
    }
}
