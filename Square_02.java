// Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape.

// Abstract class GeometricShape
abstract class GeometricShape {
    // Abstract methods to calculate area and perimeter
    public abstract double area();
    public abstract double perimeter();
}

// Triangle subclass extending GeometricShape
class Triangle extends GeometricShape {
    private double side1, side2, side3;

    // Constructor
    public Triangle(double s1, double s2, double s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    // Override area method to calculate area of triangle
    public double area() {
        // Using Heron's formula to calculate area
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Override perimeter method to calculate perimeter of triangle
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

// Square subclass extending GeometricShape
class Square_02 extends GeometricShape {
    private double side;

    // Constructor
    public Square_02(double side) {
        this.side = side;
    }

    // Override area method to calculate area of square
    public double area() {
        return side * side;
    }

    // Override perimeter method to calculate perimeter of square
    public double perimeter() {
        return 4 * side;
    }
    public static void main(String[] args) {
        // Create a Triangle object
        Triangle triangle = new Triangle(3, 4, 5);
        // Calculate and print area and perimeter of triangle
        System.out.println("Area of triangle: " + triangle.area());
        System.out.println("Perimeter of triangle: " + triangle.perimeter());

        // Create a Square object
        Square_02 square = new Square_02(4);
        // Calculate and print area and perimeter of square
        System.out.println("Area of square: " + square.area());
        System.out.println("Perimeter of square: " + square.perimeter());
    }
}
