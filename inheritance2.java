import java.util.Scanner;

class MainVehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class MainCar extends MainVehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class MainBike extends MainVehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a button.");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        MainVehicle vehicle;  // Superclass reference

        if (choice == 1) {
            vehicle = new MainCar();
        } else {
            vehicle = new MainBike();
        }

        vehicle.start();  // Runtime polymorphism
    }
}
