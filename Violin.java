//Write a Java program to create an abstract class Instrument with abstract methods play() and tune(). Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective methods to play and tune each instrument.

// Abstract class Instrument
abstract class Instrument {
    // Abstract methods to play and tune the instrument
    public abstract void play();
    public abstract void tune();
}

// Glockenspiel subclass extending Instrument
class Glockenspiel extends Instrument {
    // Implementation of play method for Glockenspiel
    @Override
    public void play() {
        System.out.println("Playing Glockenspiel...");
    }

    // Implementation of tune method for Glockenspiel
    @Override
    public void tune() {
        System.out.println("Tuning Glockenspiel...");
    }
}

// Violin subclass extending Instrument
class Violin extends Instrument {
    // Implementation of play method for Violin
    @Override
    public void play() {
        System.out.println("Playing Violin...");
    }

    // Implementation of tune method for Violin
    @Override
    public void tune() {
        System.out.println("Tuning Violin...");
    }
    public static void main(String[] args) {
        // Create a Glockenspiel object
        Glockenspiel glockenspiel = new Glockenspiel();
        // Play and tune the Glockenspiel
        System.out.println("Glockenspiel:");
        glockenspiel.play();
        glockenspiel.tune();

        // Create a Violin object
        Violin violin = new Violin();
        // Play and tune the Violin
        System.out.println("\nViolin:");
        violin.play();
        violin.tune();
    }
}
