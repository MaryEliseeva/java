package practice26;

public class Practice2 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2("Внешнее поле");
        outer.createInner();
    }
}

class Outer2 {
    private String outerField;

    public Outer2(String value) {
        this.outerField = value;
    }

    // внутренний класс
    public class Inner {
        public void display() {
            //имеет доступ даже к private полям внешнего класса
            System.out.println("Доступ к outerField: " + outerField);
            privateOuterMethod();
        }
    }

    private void privateOuterMethod() {
        System.out.println("Приватный метод внешнего класса вызван из Inner");
    }

    public void createInner() {
        Inner inner = new Inner();
        inner.display();
    }
}
