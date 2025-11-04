/**
 * Класс демонстрирует использование Javadoc.
 * Содержит примеры методов с параметрами, возвращаемыми значениями и исключениями.
 * 
 * @author Mary Eliseeva
 * @version 1.0
 * @since 2025-10-17
 */
public class practice4 {

    /**
     * Метод суммирует два числа.
     * 
     * @param a Первое число
     * @param b Второе число
     * @return Сумма чисел a и b
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * Метод делит одно число на другое.
     * 
     * @param a Делимое
     * @param b Делитель
     * @return Результат деления
     * @throws ArithmeticException если b равен 0
     */
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return a / b;
    }

    /**
     * Точка входа в программу.
     * @param args Аргументы командной строки
     */
    public static void main(String[] args) {
        practice4 p = new practice4();
        int s = p.sum(5, 7); // вызов метода sum
        System.out.println("Сумма: " + s);
        double d = p.divide(10, 2); // вызов метода divide
        System.out.println("Деление: " + d);
    }
}
