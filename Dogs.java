//Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods.

// Abstract class Animals
abstract class Animals {
    // Abstract methods
    abstract void cats();
    abstract void dogs();
}

// Subclass Cats inheriting from Animals
class Cats extends Animals {
    // Implementing abstract method cats
    @Override
    void cats() {
        System.out.println("Cats meow");
    }

    // Implementing abstract method dogs
    @Override
    void dogs() {
        // This method is not used in this subclass
    }
}

// Subclass Dogs inheriting from Animals
class Dogs extends Animals {
    // Implementing abstract method cats
    @Override
    void cats() {
        // This method is not used in this subclass
    }

    // Implementing abstract method dogs
    void dogs() {
        System.out.println("Dogs bark");
    }
    public static void main(String[] args) {
        // Create object of Cats class
        Cats cat = new Cats();
        // Call method cats
        cat.cats();

        // Create object of Dogs class
        Dogs dog = new Dogs();
        // Call method dogs
        dog.dogs();
    }
}

