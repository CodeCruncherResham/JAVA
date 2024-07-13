//An abstract class has a construtor which prints "This is constructor of abstract class", an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class". A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method". Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)

// Abstract class
abstract class AbstractClass {
    // Constructor of abstract class
    AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    // Abstract method
    abstract void a_method();

    // Non-abstract method
    void normal_method() {
        System.out.println("This is a normal method of abstract class");
    }
}

// Subclass inheriting from AbstractClass
class SubClass extends AbstractClass {
    // Overriding abstract method
    void a_method() {
        System.out.println("This is abstract method");
    }
    public static void main(String[] args) {
        // Create object of SubClass
        SubClass obj = new SubClass();

        // Call abstract method
        obj.a_method();

        // Call non-abstract method
        obj.normal_method();
    }
}

