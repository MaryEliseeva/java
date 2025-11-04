package practice8;

public class SwitchFallThrough {
    public static void main(String[] args) {
        
        int i = 0;
        int value = 2;

        switch (value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2; // break отсутствует → выполнение "падает" в case 3
            case 3:
                i = 3;
                break;
        }

        System.out.println("После switch i = " + i);
        // Вывод: i = 3, потому что после case 2 выполнение продолжается в case 3
    }
}