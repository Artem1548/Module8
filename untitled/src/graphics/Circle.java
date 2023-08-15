package graphics;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle"); // Виклик конструктора базового класу з ім'ям "Circle"
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
