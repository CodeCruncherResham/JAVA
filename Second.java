//create an abstract class 'Parent' with a method 'msg'.it has 2 subclass each having a method with the same name 'msg' that prints "this is first subclass" and "this is second subclass" respectively.call the methods 'msg' by creating an object for each subclass.


// Abstract class Parent
abstract class Parent {
    abstract void msg();
}

// FirstSubclass subclass of Parent
class First extends Parent 
{
    void msg() {
        System.out.println("This is first subclass");
    }
}

// SecondSubclass subclass of Parent
class Second extends Parent 
{
    void msg() {
        System.out.println("This is second subclass");
    }
    public static void main(String[] args) 
    {
        First firstObj = new First();
        Second secondObj = new Second();

        firstObj.msg(); // Call msg method of FirstSubclass
        secondObj.msg(); // Call msg method of SecondSubclass
    }
}

