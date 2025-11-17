package practice33;

import java.util.Date;
import java.util.Formatter;

public class practice3 {
    public static void main(String[] args) {
        Formatter timeFormatter = new Formatter();
        Date now = new Date();

        timeFormatter.format("Часы (24ч формат): %tH%n", now);      // %tH — часы 00-23
        timeFormatter.format("Минуты: %tM%n", now);                 // %tM — минуты
        timeFormatter.format("Секунды: %tS%n", now);               // %tS — секунды
        timeFormatter.format("Год полностью: %tY%n", now);          // %tY — год 4 цифры
        timeFormatter.format("День недели: %tA%n", now);            // %tA — полное название дня недели

        System.out.println(timeFormatter.toString());

        timeFormatter.close();
    }
}
