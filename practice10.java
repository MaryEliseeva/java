import java.util.Arrays;

public class practice10 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};

        // toString()
        System.out.println("Массив arr: " + Arrays.toString(arr));

        // sort()
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));

        // binarySearch()
        int index = Arrays.binarySearch(arr, 4);
        System.out.println("Индекс элемента 4: " + index);

        // equals()
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("arr и arr2 равны? " + Arrays.equals(arr, arr2));

        // compare() 
        Integer[] objArr1 = {1, 2, 3};
        Integer[] objArr2 = {1, 2, 4};
        int cmpResult = Arrays.compare(objArr1, objArr2); // отрицательное число, т.к. 3 < 4
        System.out.println("Сравнение objArr1 и objArr2: " + cmpResult);
    }
}
