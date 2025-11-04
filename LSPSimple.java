import java.util.*;

interface Figure {
    int calculateArea();
}

// Прямоугольник
class Rectangle implements Figure {
    private int width, height;
    public Rectangle(int w, int h) { width = w; height = h; }
    public int calculateArea() { return width * height; }
}

// Квадрат - НЕ наследует Rectangle
class Square implements Figure {
    private int side;
    public Square(int s) { side = s; }
    public int calculateArea() { return side * side; }
}

// Сервис для работы с фигурами
class GeometryService {
    public static int getTotalArea(List<Figure> figures) {
        int total = 0;
        for (Figure f : figures) total += f.calculateArea();
        return total;
    }
}

// Главный класс
public class LSPSimple {
    public static void main(String[] args) {
        System.out.println("=== Принцип подстановки Лисков ===\n");
        
        // Создаем разные фигуры
        Figure rect = new Rectangle(2, 5);
        Figure square = new Square(5);
        
        System.out.println("Прямоугольник 2x5: " + rect.calculateArea());
        System.out.println("Квадрат 5x5: " + square.calculateArea());
        
        // Работаем через общий интерфейс
        List<Figure> figures = Arrays.asList(rect, square);
        int total = GeometryService.getTotalArea(figures);
        
        System.out.println("Общая площадь: " + total);
        
        // Проверяем утверждения
        assert rect.calculateArea() == 10;
        assert square.calculateArea() == 25; 
        assert total == 35;
        
    }
}