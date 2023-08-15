package graphics;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(8.0);
        Quad quad = new Quad(6.0);
        Square square = new Square(4.0);
        Rhombus rhombus = new Rhombus(6.0, 8.0, 9.0);
        Triangle triangle = new Triangle(7.0, 8.0);

        ShapePrinter shapePrinter = new ShapePrinter();
        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(quad);
        shapePrinter.printShapeName(square);
        shapePrinter.printShapeName(rhombus);
        shapePrinter.printShapeName(triangle);
    }
}