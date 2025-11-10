public class practice29 {

    static class Parent {
        public void sayHello() {
            System.out.println("Hello");
        }
    }

    static class Child extends Parent {

        @Override // показывает, что метод переопределён
        public void sayHello() {
            System.out.println("Hello, world!");
        }

        @Deprecated // устаревший метод
        public void oldMethod() {
            System.out.println("Old method - не использовать");
        }

        @SuppressWarnings("rawtypes") // подавляет предупреждение о необобщённом типе
        public void uncheckedExample() {
            java.util.List list = new java.util.ArrayList();
            list.add("test");
            System.out.println("Список: " + list);
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
        c.oldMethod();
        c.uncheckedExample();
    }
}
