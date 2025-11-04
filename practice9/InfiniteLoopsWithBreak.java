package practice9;

public class InfiniteLoopsWithBreak {
    public static void main(String[] args) {

        // Бесконечный цикл while 
        int i = 0;
        while (true) { 
            System.out.println("i = " + i);
            i++;
            if (i >= 5) {  
                break;
            }
        }

        // Бесконечный цикл do-while
        int j = 0;
        do {
            System.out.println("j = " + j);
            j++;
            if (j >= 5) {  // выход из цикла после 5 итераций
                break;
            }
        } while (true);
    }
}