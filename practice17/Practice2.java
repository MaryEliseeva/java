package practice17;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {

  static void printList(List<? extends Number> list) {
    for (Number n : list) {
      System.out.println("Number: " + n);
    }
  }

  // Метод может добавлять целые числа в список,
  // если он содержит Integer или его суперклассы
  static void addInteger(List<? super Integer> list) {
    list.add(42);
    System.out.println("Добавлен элемент 42");
  }

  public static void main(String[] args) {
    List<Integer> ints = new ArrayList<>();
    List<Double> doubles = new ArrayList<>();
    List<Number> numbers = new ArrayList<>();
    List<Object> objects = new ArrayList<>();

    ints.add(10);
    doubles.add(3.14);
    numbers.add(99);

    System.out.println("Пример <? extends Number>");
    printList(ints); // Integer — потомок Number
    printList(doubles); // Double — потомок Number
    printList(numbers); // Number — тот же тип

    System.out.println("\nПример <? super Integer>");
    addInteger(numbers); // Number — супертип Integer
    addInteger(objects); // Object — супертип Integer
  }
}
// Конструкции <? extends T> и <? super T> нужны, чтобы управлять тем, какие
// типы можно передавать в обобщённые методы и коллекции.
// <? extends T> используют, когда нужно только читать данные (из подклассов T),
// а <? super T> — когда нужно добавлять объекты типа T в коллекцию.