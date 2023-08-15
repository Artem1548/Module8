package graphics;

class Rhombus extends Shape {
    private double sideLength;
    private double diagonalLength1;
    private double diagonalLength2;

    public Rhombus(double sideLength, double diagonalLength1, double diagonalLength2) {
        super("Rhombus");
        this.sideLength = sideLength;
        this.diagonalLength1 = diagonalLength1;
        this.diagonalLength2 = diagonalLength2;
    }

    @Override
    public double calculateArea() {
        return (diagonalLength1 * diagonalLength2) / 2;
    }
}
