package practice26;

public class Practice1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.PublicInner publicInner = outer.new PublicInner();
        publicInner.show();

        //Outer.ProtectedInner доступен только внутри пакета или наследникам
        //Outer.DefaultInner (без модификатора) доступен только в том же пакете
        //Outer.PrivateInner недоступен за пределами Outer
    }
}

class Outer {
    public class PublicInner {
        public void show() {
            System.out.println("Публичный внутренний класс доступен всем.");
        }
    }

    protected class ProtectedInner {
        protected void show() {
            System.out.println("Protected внутренний класс доступен в пакете и наследникам.");
        }
    }

    class DefaultInner {
        void show() {
            System.out.println("Класс без модификатора доступен только внутри пакета.");
        }
    }

    private class PrivateInner {
        private void show() {
            System.out.println("Приватный внутренний класс доступен только во внешнем классе.");
        }
    }
}
