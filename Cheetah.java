// . Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.

// Animal class
class Animal {
    // Method to move
    public void move() {
        System.out.println("Animal moves");
    }
}

// Cheetah subclass extending Animal
class Cheetah extends Animal {
    // Override move method to run
    @Override
    public void move() {
        System.out.println("Cheetah runs");
    }
    public static void main(String[] args) {
        // Create a Cheetah object
        Cheetah cheetah = new Cheetah();

        // Call move method
        cheetah.move(); // Output will be "Cheetah runs"
    }
}
