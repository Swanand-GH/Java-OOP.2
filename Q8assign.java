import java.util.Scanner;

class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a button.");
    }
}

public class Q8assign {
    public static void main(String[] args) {
        System.err.print("Enter 1 (Car) or 2 (Bike): ");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }

        int choice = scanner.nextInt();
        scanner.close();

        Vehicle vehicle;
        switch (choice) {
            case 2:
                vehicle = new Bike();
                break;
            default:
                vehicle = new Car();
                break;
        }

        vehicle.start();
    }
}
