package practice23;

class Animal {
  public String sound() {
    return "звук";
  }
}

class Dog extends Animal {
  @Override
  public String sound() {
    return "лай";
  }
}

public class OverridingExample {
  public static void main(String[] args) {
    Animal a = new Animal();
    Dog d = new Dog();

    System.out.println(a.sound());
    System.out.println(d.sound());
  }
}
// Если тип возвращаемого значения не совпадает (например, в Animal — String, а
// в Dog — int), программа не скомпилируется, потому что переопределённый метод
// должен иметь тот же тип возвращаемого значения или его подтип.