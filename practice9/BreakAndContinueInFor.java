package practice9;

public class BreakAndContinueInFor {
    public static void main(String[] args) {
        
        for (int k = 1; k <= 10; k++) {
            if (k == 4) {
                continue;  // пропускаем итерацию k=4
            }
            if (k == 8) {
                break;  // выход из цикла на k=8
            }
            System.out.println("k = " + k);
        }
    }
}