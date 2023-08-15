package graphics;

class Quad extends Shape {
    private double sideLength;

    public Quad(double sideLength) {
        super("Quad");
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}
