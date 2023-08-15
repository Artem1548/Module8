package graphics;



public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void printName() {
        System.out.println("Shape: " + name);
    }
}