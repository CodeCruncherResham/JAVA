// Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
// Parent class Shape
class Shape {
    // Method to get area
    double getArea() {
        return 0; // Default implementation returns 0
    }
}

// Subclass Rectangle extending Shape
class Rectangle_02 extends Shape {
    // Data members to store length and width of rectangle
    double length;
    double width;

    // Constructor to initialize length and width
    Rectangle_02(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override getArea method to calculate area of rectangle
    double getArea() {
        return length * width;
    }
    public static void main(String[] args) {
        // Create a Rectangle object with length 5 and width 4
        Rectangle_02 rectangle = new Rectangle_02(5, 4);

        // Calculate and print the area of the rectangle
        System.out.println("Area of rectangle: " + rectangle.getArea());
    }
}

