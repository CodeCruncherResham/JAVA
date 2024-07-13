// Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape

// Abstract class Shape3D
abstract class Shape3D {
    // Abstract methods to calculate volume and surface area
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}

// Sphere subclass extending Shape3D
class Sphere extends Shape3D {
    private double radius;

    // Constructor for Sphere
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateVolume method for Sphere
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Implementation of calculateSurfaceArea method for Sphere
    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

// Cube subclass extending Shape3D
class Cube_Abs extends Shape3D {
    private double side;

    // Constructor for Cube
    public Cube_Abs(double side) {
        this.side = side;
    }

    // Implementation of calculateVolume method for Cube
    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    // Implementation of calculateSurfaceArea method for Cube
    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
    public static void main(String[] args) {
        // Create a Sphere object with radius 5
        Sphere sphere = new Sphere(5);
        // Calculate and print volume and surface area of the sphere
        System.out.println("Sphere:");
        System.out.println("Volume: " + sphere.calculateVolume());
        System.out.println("Surface Area: " + sphere.calculateSurfaceArea());

        // Create a Cube object with side length 4
        Cube_Abs cube = new Cube_Abs(4);
        // Calculate and print volume and surface area of the cube
        System.out.println("\nCube:");
        System.out.println("Volume: " + cube.calculateVolume());
        System.out.println("Surface Area: " + cube.calculateSurfaceArea());
    }
}
