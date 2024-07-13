// Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound.



// Abstract class Bird
abstract class Bird {
    // Abstract methods to describe flying and making sound
    public abstract void fly();
    public abstract void makeSound();
}

// Eagle subclass extending Bird
class Eagle extends Bird {
    // Implementation of fly method for Eagle
    @Override
    public void fly() {
        System.out.println("Eagle flies high in the sky.");
    }

    // Implementation of makeSound method for Eagle
    @Override
    public void makeSound() {
        System.out.println("Eagle makes a screeching sound.");
    }
}

// Hawk subclass extending Bird
class Hawk extends Bird {
    // Implementation of fly method for Hawk
    @Override
    public void fly() {
        System.out.println("Hawk flies swiftly across the horizon.");
    }

    // Implementation of makeSound method for Hawk
    @Override
    public void makeSound() {
        System.out.println("Hawk makes a piercing cry.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an Eagle object
        Eagle eagle = new Eagle();
        // Describe how Eagle flies and makes a sound
        System.out.println("Eagle:");
        eagle.fly();
        eagle.makeSound();

        // Create a Hawk object
        Hawk hawk = new Hawk();
        // Describe how Hawk flies and makes a sound
        System.out.println("\nHawk:");
        hawk.fly();
        hawk.makeSound();
    }
}
