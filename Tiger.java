//Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.

// Abstract class Animal
abstract class Animal {
    // Abstract method sound
    abstract void sound();
}

// Subclass Lion extending Animal
class Lion extends Animal {
    // Implementation of sound method for Lion
    void sound() {
        System.out.println("Lion roars");
    }
}

// Subclass Tiger extending Animal
class Tiger extends Animal {
    // Implementation of sound method for Tiger
    void sound() {
        System.out.println("Tiger growls");
    }
    public static void main(String[] args) {
        // Create objects of Lion and Tiger
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        // Call sound method for Lion and Tiger
        lion.sound(); // Output: Lion roars
        tiger.sound(); // Output: Tiger growls
    }
}

