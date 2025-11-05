// StaticExample.java
public class StaticExample {
    public static int a = 1;
    public static int b;
    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        //прямой вызов внутри того же класса
        printVars();

        //через имя класса
        StaticExample.printVars();

        //через объект
        StaticExample obj = new StaticExample();
        obj.printVars();
    }
}
