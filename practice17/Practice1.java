package practice17;

class Wrapper<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>();
        Wrapper<String> strWrapper = new Wrapper<>();

        // Проверяем объект с помощью instanceof
        System.out.println(intWrapper instanceof Wrapper);       
        System.out.println(strWrapper instanceof Wrapper<?>);     
        System.out.println(intWrapper instanceof Object);        
    }
}
