//We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.

// Abstract class Shape
abstract class Shape {
    // Abstract methods for calculating area
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

// Class Area containing methods for calculating area of rectangle, square, and circle
class Area extends Shape {
    // Method to calculate area of rectangle
    @Override
    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }

    // Method to calculate area of square
    @Override
    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of square: " + area);
    }

    // Method to calculate area of circle
    @Override
    void CircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
    public static void main(String[] args) {
        // Create an object of class Area
        Area areaObj = new Area();
        
        // Calculate and print area of rectangle
        areaObj.RectangleArea(5, 7);
        
        // Calculate and print area of square
        areaObj.SquareArea(4);
        
        // Calculate and print area of circle
        areaObj.CircleArea(3);
    }
}

