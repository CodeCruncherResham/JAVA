// Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

abstract class Vehicle
{
    abstract void drive();
}
class Car extends Vehicle
{
    void drive()
    {
        System.out.println("repairing a car");
    }
    public static void main(String[] args)
    {
        Car a = new Car();
        a.drive();
    }
}