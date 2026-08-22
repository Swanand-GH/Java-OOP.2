abstract class GeometricShape {
    public abstract double area();
    public abstract double perimeter();
}

class Triangle extends GeometricShape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA + sideB <= sideC ||
            sideA + sideC <= sideB ||
            sideB + sideC <= sideA) {
            throw new IllegalArgumentException(
                "Invalid triangle sides: " + sideA + ", " + sideB + ", " + sideC
            );
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

class Square extends GeometricShape {
    private double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException(
                "Invalid side length: " + side
            );
        }

        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

public class Abstraction3 {
    public static void main(String[] args) {
        GeometricShape triangle = new Triangle(3, 4, 5);

        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        GeometricShape square = new Square(5);

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());

        GeometricShape shape = new Square(5);
        System.out.println("\nPolymorphism check - shape.area(): " + shape.area());

        System.out.println("\nAttempting to create an invalid triangle (1, 2, 10)...");

        try {
            Triangle invalid = new Triangle(1, 2, 10);
            System.out.println("Invalid Triangle Area: " + invalid.area());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}
