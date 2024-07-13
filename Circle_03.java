// Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.

import java.lang.Math;

// Shape class
class Shape {
    // Method to calculate perimeter (default implementation)
    public double getPerimeter() {
        return 0.0; // Default implementation
    }

    // Method to calculate area (default implementation)
    public double getArea() {
        return 0.0; // Default implementation
    }
}

// Circle subclass extending Shape
class Circle_03 extends Shape {
    // Properties
    private double radius;

    // Constructor
    public Circle_03(double radius) {
        this.radius = radius;
    }

    // Method to calculate perimeter (override)
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // Perimeter of circle formula: 2 * pi * radius
    }

    // Method to calculate area (override)
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Area of circle formula: pi * radius^2
    }
    public static void main(String[] args) {
        // Create a circle object with radius 5
        Circle_03 circle = new Circle_03(5);

        // Display perimeter and area of the circle
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
