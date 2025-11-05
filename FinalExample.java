public class FinalExample {
    public final int a;         
    public final int b = 10;    // инициализация при объявлении
    public final int c;         
    public final int d;        

    // инициализация в конструкторе
    public FinalExample(int value) {
        this.a = value;
        this.c = 100;
    }

    //инициализация в блоке
    {
        d = 50;
    }

    public void printValues() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }

    public static void main(String[] args) {
        FinalExample obj = new FinalExample(5);
        obj.printValues();
    }
}
