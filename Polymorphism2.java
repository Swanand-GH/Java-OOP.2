class Vehicle {
    public void startEngine() {
        System.out.println("Starting the vehicle's engine.");
    }

    public void stopEngine() {
        System.out.println("Stopping the vehicle's engine.");
    }
}
class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Starting the car engine with an ignition switch.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the car engine by turning off the ignition.");
    }
}
class Motorcycle extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println(
            "Starting the motorcycle engine with a kick-start/electric starter."
        );
    }

    @Override
    public void stopEngine() {
        System.out.println(
            "Stopping the motorcycle engine with the kill switch."
        );
    }
}
public class Polymorphism2 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();
        vehicle.stopEngine();

        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        Motorcycle moto = new Motorcycle();
        moto.startEngine();
        moto.stopEngine();

        System.out.println("\n--- Polymorphism Demo ---");

        Vehicle[] fleet = {vehicle, car, moto};

        for (Vehicle v : fleet) {
            v.startEngine();
            v.stopEngine();
        }
    }
}