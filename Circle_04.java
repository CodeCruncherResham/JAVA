//Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize(). Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods to draw and resize each shape.


//// Abstract class Shape2D
abstract class Shape2D {
    // Abstract methods to draw and resize the shape
    public abstract void draw();
    public abstract void resize();
}

// Rectangle subclass extending Shape2D
class Rectangle extends Shape2D {
    // Implementation of draw method for Rectangle
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }

    // Implementation of resize method for Rectangle
    @Override
    public void resize() {
        System.out.println("Resizing Rectangle...");
    }
}

// Circle subclass extending Shape2D
class Circle_04 extends Shape2D {
    // Implementation of draw method for Circle
    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }

    // Implementation of resize method for Circle
    @Override
    public void resize() {
        System.out.println("Resizing Circle...");
    }
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle();
        // Draw and resize the Rectangle
        System.out.println("Rectangle:");
        rectangle.draw();
        rectangle.resize();

        // Create a Circle object
        Circle_04 circle = new Circle_04();
        // Draw and resize the Circle
        System.out.println("\nCircle:");
        circle.draw();
        circle.resize();
    }
}
