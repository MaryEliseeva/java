package practice5;

public class InstanceofOperator {
    public static void main(String[] args) {
        // --- Практика #2 ---
        Object obj1 = "Hello";
        Object obj2 = 123;
        Object obj3 = null;

        System.out.println("obj1 instanceof String: " + (obj1 instanceof String)); // true
        System.out.println("obj2 instanceof Integer: " + (obj2 instanceof Integer)); // true
        System.out.println("obj1 instanceof Object: " + (obj1 instanceof Object)); // true
        System.out.println("obj3 instanceof Object: " + (obj3 instanceof Object)); // false

        Number num = 3.14;
        System.out.println("num instanceof Double: " + (num instanceof Double)); // true
        System.out.println("num instanceof Number: " + (num instanceof Number)); // true
    }
}