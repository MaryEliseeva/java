package practice23;

public class OverloadingExample {
    public void printInfo(String name) {
        System.out.println("Имя: " + name);
    }

    public void printInfo(String name, int age) {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    public void printInfo(String name, int age, String city) {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Город: " + city);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.printInfo("Анна");
        obj.printInfo("Иван", 20);
        obj.printInfo("Мария", 25, "Москва");
    }
}
