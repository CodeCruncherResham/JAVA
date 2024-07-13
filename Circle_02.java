// Abstract class Shape
abstract class Shape {
    // Abstract method for calculating area
    abstract double calculateArea();
}

// Rectangle class inheriting from Shape
class Rectangle extends Shape {
    private double length;
    private double breadth;

    // Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area of rectangle
    double calculateArea() {
        return length * breadth;
    }
}

// Square class inheriting from Shape
class Square extends Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate area of square
    double calculateArea() {
        return side * side;
    }
}

// Circle class inheriting from Shape
class Circle_02 extends Shape {
    private double radius;

    // Constructor
    public Circle_02(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        // Array of shapes
        Shape[] shapes = new Shape[13];
        
        // Adding rectangles
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Rectangle(7, 12);
        shapes[2] = new Rectangle(8, 6);
        shapes[3] = new Rectangle(3, 4);
        
        // Adding squares
        shapes[4] = new Square(5);
        shapes[5] = new Square(7);
        shapes[6] = new Square(4);
        shapes[7] = new Square(6);
        
        // Adding circles
        shapes[8] = new Circle_02(3);
        shapes[9] = new Circle_02(5);
        shapes[10] = new Circle_02(7);
        shapes[11] = new Circle_02(4);
        shapes[12] = new Circle_02(6);
        
        // Calculate and print areas of all shapes
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}

