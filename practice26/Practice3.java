package practice26;

public class Practice3 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.testInner();
    }
}

class Outer3 {
    public class Inner {
        private String inf = "приватное поле внутреннего класса";

        private void reveal() {
            System.out.println("Внутренний метод reveal()");
        }
    }

    public void testInner() {
        Inner inner = new Inner();
        //Внешний класс имеет доступ к private полям и методам внутреннего
        System.out.println("Доступ к inner.inf: " + inner.inf);
        inner.reveal();
    }
}
