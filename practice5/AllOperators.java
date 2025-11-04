package practice5;

public class AllOperators {
    public static void main(String[] args) {
        int a = 5, b = 3;
        boolean flag1 = true, flag2 = false;
        String s1 = "Hello", s2 = "World";

        //арифметические
        // +, -, *, /, %
        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a * b: " + (a * b));
        System.out.println("a / b: " + (a / b));
        System.out.println("a % b: " + (a % b));
        System.out.println("s1 + s2: " + (s1 + s2));

        // ++, -- (префикс и постфикс)
        int n = 5;

        //инкремент и декремент
        System.out.println("Исходное n = " + n);
        System.out.println("n++: " + (n++)); // постфикс - сначала используем, потом увеличиваем
        System.out.println("После n++: n = " + n);
        System.out.println("++n: " + (++n)); // префикс - сначала увеличиваем, потом используем
        System.out.println("После ++n: n = " + n);
        System.out.println("n--: " + (n--)); // постфикс
        System.out.println("После n--: n = " + n);
        System.out.println("--n: " + (--n)); // префикс
        System.out.println("После --n: n = " + n);

        //присваивания
        // = и +=
        int c = a;           
        System.out.println("c = a: " + c);
        c += b;              // c = c + b
        System.out.println("c += b: " + c);
        
        String s3 = s1;      
        s3 += s2;            
        System.out.println("s3 += s2: " + s3);

        // -=, *=, /=, %=
        int d = 10;
        System.out.println("\nИсходное d = " + d);
        d -= 2; System.out.println("d -= 2: " + d);
        d *= 3; System.out.println("d *= 3: " + d);
        d /= 4; System.out.println("d /= 4: " + d);
        d %= 3; System.out.println("d %= 3: " + d);

        //сравнение
        // ==, !=
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 != s2: " + (s1 != s2));

        // >, >=, <, <=
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));

        //логические
        // ||, && 
        System.out.println("flag1 || flag2: " + (flag1 || flag2));
        System.out.println("flag1 && flag2: " + (flag1 && flag2));

        // |, ^, & 
        System.out.println("flag1 | flag2: " + (flag1 | flag2));
        System.out.println("flag1 ^ flag2: " + (flag1 ^ flag2));
        System.out.println("flag1 & flag2: " + (flag1 & flag2));

        // побитовые
        // >>, >>>, <<
        int shift = 8;
        System.out.println("Исходное число: " + shift + " (бинарно: " + Integer.toBinaryString(shift) + ")");
        System.out.println("shift >> 2: " + (shift >> 2) + " (бинарно: " + Integer.toBinaryString(shift >> 2) + ")");
        System.out.println("shift >>> 2: " + (shift >>> 2) + " (бинарно: " + Integer.toBinaryString(shift >>> 2) + ")");
        System.out.println("shift << 2: " + (shift << 2) + " (бинарно: " + Integer.toBinaryString(shift << 2) + ")");

        // ~ и !
        int m = 5;
        boolean bool = true;
        System.out.println("~m: " + (~m) + " (побитовое НЕ)");
        System.out.println("!bool: " + (!bool) + " (логическое НЕ)");

        //тернарный
        // ?:
        int max = (a > b) ? a : b;
        System.out.println("max = (a > b) ? a : b = " + max);

        //скобки и массивы
        // ( ) и [ ]
        int[] arr = {1, 2, 3};
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("(a + b) * 2 = " + ((a + b) * 2) + " (скобки меняют приоритет)");
    }
}