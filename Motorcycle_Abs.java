// Abstract class Vehicle
abstract class Vehicle {
    // Abstract methods to start and stop engine
    public abstract void startEngine();
    public abstract void stopEngine();
}

// Car subclass extending Vehicle
class Car extends Vehicle {
    // Implementation of startEngine method for Car
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    // Implementation of stopEngine method for Car
    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

// Motorcycle subclass extending Vehicle
class Motorcycle_Abs extends Vehicle {
    // Implementation of startEngine method for Motorcycle
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    // Implementation of stopEngine method for Motorcycle
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car();
        // Start and stop the car engine
        System.out.println("Car:");
        car.startEngine();
        car.stopEngine();

        // Create a Motorcycle object
        Motorcycle_Abs motorcycle = new Motorcycle_Abs();
        // Start and stop the motorcycle engine
        System.out.println("\nMotorcycle:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
