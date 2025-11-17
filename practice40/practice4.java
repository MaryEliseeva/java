package practice40;

import java.io.FileInputStream;
import java.io.IOException;

public class practice4 {
  public static void main(String[] args) {
    // AutoCloseable позволяет автоматически закрывать ресурсы (файлы, потоки)
    // после использования, используя конструкцию try-with-resources.
    try (MyResource resource = new MyResource()) {
      resource.doSomething();
    } catch (Exception e) {
      System.out.println("Ошибка: " + e.getMessage());
    }
  }

  static class MyResource implements AutoCloseable {
    public void doSomething() {
      System.out.println("Ресурс выполняет работу");
    }

    @Override
    public void close() {
      System.out.println("Ресурс автоматически закрыт через try-with-resources");
    }
  }
}