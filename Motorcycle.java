//Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

// Base class Vehicle
class Vehicle {
    // Properties
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    // Constructor
    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // Method to calculate fuel efficiency (default implementation)
    public double calculateFuelEfficiency() {
        return 0.0; // Default fuel efficiency calculation
    }

    // Method to calculate distance traveled (default implementation)
    public double calculateDistanceTraveled(double time) {
        return 0.0; // Default distance calculation
    }

    // Method to get maximum speed (default implementation)
    public int getMaxSpeed() {
        return 0; // Default maximum speed
    }
}

// Subclass Truck extending Vehicle
class Truck extends Vehicle {
    // Constructor
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    // Method to calculate fuel efficiency (override)
    @Override
    public double calculateFuelEfficiency() {
        return 8.5; // Fuel efficiency of trucks (in miles per gallon)
    }

    // Method to calculate distance traveled (override)
    @Override
    public double calculateDistanceTraveled(double time) {
        return getMaxSpeed() * time; // Distance = speed * time
    }

    // Method to get maximum speed (override)
    @Override
    public int getMaxSpeed() {
        return 70; // Maximum speed of trucks (in miles per hour)
    }
}

// Subclass Car extending Vehicle
class Car extends Vehicle {
    // Constructor
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    // Method to calculate fuel efficiency (override)
    @Override
    public double calculateFuelEfficiency() {
        return 25.0; // Fuel efficiency of cars (in miles per gallon)
    }

    // Method to get maximum speed (override)
    @Override
    public int getMaxSpeed() {
        return 120; // Maximum speed of cars (in miles per hour)
    }
}

// Subclass Motorcycle extending Vehicle
class Motorcycle extends Vehicle {
    // Constructor
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    // Method to calculate fuel efficiency (override)
    @Override
    public double calculateFuelEfficiency() {
        return 50.0; // Fuel efficiency of motorcycles (in miles per gallon)
    }

    // Method to calculate distance traveled (override)
    @Override
    public double calculateDistanceTraveled(double time) {
        return getMaxSpeed() * time; // Distance = speed * time
    }

    // Method to get maximum speed (override)
    @Override
    public int getMaxSpeed() {
        return 150; // Maximum speed of motorcycles (in miles per hour)
    }
    public static void main(String[] args) {
        // Create objects for different types of vehicles
        Truck truck = new Truck("Ford", "F150", 2022, "Gasoline");
        Car car = new Car("Toyota", "Camry", 2022, "Gasoline");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR1000RR", 2022, "Gasoline");

        // Display information about each vehicle
        System.out.println("Truck:");
        System.out.println("Make: " + truck.make);
        System.out.println("Model: " + truck.model);
        System.out.println("Year: " + truck.year);
        System.out.println("Fuel Type: " + truck.fuelType);
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Maximum Speed: " + truck.getMaxSpeed() + " mph");
        System.out.println("Distance Traveled in 2 hours: " + truck.calculateDistanceTraveled(2) + " miles");
        System.out.println();

        System.out.println("Car:");
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Fuel Type: " + car.fuelType);
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Maximum Speed: " + car.getMaxSpeed() + " mph");
        System.out.println();

        System.out.println("Motorcycle:");
        System.out.println("Make: " + motorcycle.make);
        System.out.println("Model: " + motorcycle.model);
        System.out.println("Year: " + motorcycle.year);
        System.out.println("Fuel Type: " + motorcycle.fuelType);
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Maximum Speed: " + motorcycle.getMaxSpeed() + " mph");
        System.out.println("Distance Traveled in 3 hours: " + motorcycle.calculateDistanceTraveled(3) + " miles");
    }
}
