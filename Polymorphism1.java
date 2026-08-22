class Shape {
    public double calculateArea() {
        return 0.0;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(6, 8);
        System.out.println("Triangle Area: " + triangle.calculateArea());

        System.out.println("\n--- Polymorphism Demo ---");

        Shape[] shapes = {circle, rectangle, triangle};

        for (Shape s : shapes) {
            System.out.println(
                s.getClass().getSimpleName() + " Area: " + s.calculateArea()
            );
        }
    }
}