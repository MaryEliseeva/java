package practice3;

// Интерфейс
interface Printable {
    void print();
}

// Класс, реализующий интерфейс
class Document implements Printable {
    private String text;
    
    Document(String text) { 
        this.text = text; 
    }

    @Override
    public void print() {
        System.out.println(text);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        var doc = new Document("var");
        doc.print();

        Printable p = new Document("printable");
        p.print();
    }
}