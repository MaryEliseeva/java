class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Проверка на одинаковые объекты
        if (this == obj) {
            return true;
        }

        // 2. Проверка на null и совпадение классов
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 3. Приведение типов и сравнение полей
        Student student = (Student) obj;
        return age == student.age && name.equals(student.name);
    }
}

public class practice24 {
    public static void main(String[] args) {
        Student s1 = new Student("Иван", 20);
        Student s2 = new Student("Иван", 20);
        Student s3 = new Student("Иван", 20);
        Student s4 = new Student("Анна", 21);

        // Проверка на рефлексивность
        System.out.println(s1.equals(s1)); // true

        // Проверка на null
        System.out.println(s1.equals(null)); // false

        // Проверка на симметричность
        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s1)); // true

        // Проверка на транзитивность
        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(s1.equals(s3)); // true

        // Проверка на разные объекты
        System.out.println(s1.equals(s4)); // false
    }
}
