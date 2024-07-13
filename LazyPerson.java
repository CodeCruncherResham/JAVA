// Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.

// Abstract class Person
abstract class Person {
    // Abstract methods to eat and exercise
    public abstract void eat();
    public abstract void exercise();
}

// Athlete subclass extending Person
class Athlete extends Person {
    // Implementation of eat method for Athlete
    @Override
    public void eat() {
        System.out.println("Athlete eats a balanced diet for energy.");
    }

    // Implementation of exercise method for Athlete
    @Override
    public void exercise() {
        System.out.println("Athlete engages in rigorous training sessions.");
    }
}

// LazyPerson subclass extending Person
class LazyPerson extends Person {
    // Implementation of eat method for LazyPerson
    @Override
    public void eat() {
        System.out.println("Lazy person eats junk food and snacks.");
    }

    // Implementation of exercise method for LazyPerson
    @Override
    public void exercise() {
        System.out.println("Lazy person avoids exercise and prefers sedentary activities.");
    }
    public static void main(String[] args) {
        // Create an Athlete object
        Athlete athlete = new Athlete();
        // Describe how the athlete eats and exercises
        System.out.println("Athlete:");
        athlete.eat();
        athlete.exercise();

        // Create a LazyPerson object
        LazyPerson lazyPerson = new LazyPerson();
        // Describe how the lazy person eats and exercises
        System.out.println("\nLazy Person:");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
