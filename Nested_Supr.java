class M {
    M() {
        System.out.println("Default constructor for parent");
    }

    M(int q) {
        System.out.println("1 parameter constructor for parent");
    }

    M(int q, int p) {
        System.out.println("2 parameter constructor for parent");
    }
}

class Nested extends M {
    Nested() {
        super(); // Call default constructor of parent class M
        System.out.println("Default constructor for subclass");
    }

    Nested(int q) {
        // super(q); // Call 1 parameter constructor of parent class M
        System.out.println("1 parameter constructor for subclass");
    }

    Nested(int q, int p) {
        super(q, p); // Call 2 parameter constructor of parent class M
        System.out.println("2 parameter constructor for subclass");
    }
}

class Nested_Supr extends Nested {
    Nested_Supr() {
        // super(); // Call default constructor of subclass Nested
        System.out.println("Default constructor for child");
    }

    Nested_Supr(int q) {
        super(q); // Call 1 parameter constructor of subclass Nested
        System.out.println("1 parameter constructor for child");
    }

    Nested_Supr(int q, int p) {
        // super(q, p); // Call 2 parameter constructor of subclass Nested
        System.out.println("2 parameter constructor for child");
    }

    public static void main(String[] args) {
        Nested_Supr x = new Nested_Supr(); // Calls default constructors of all classes
        Nested_Supr y = new Nested_Supr(35); // Calls default constructor of parent and 1 parameter constructor of subclass
        Nested_Supr z = new Nested_Supr(2, 6); // Calls 2 parameter constructor of parent and subclass
    }
}
