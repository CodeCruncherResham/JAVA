
//it's a example of method overriding with Super kryword
class Square {
    int a;
    public void set(int side) {
        // Set side for square
        a = side;
    }

    void cal() {
        System.out.println( "Square is : " +a * a); // Square area calculation
    }
}
class Circle extends Square {

    void cal() {
        System.out.println("circle is : " + 3.14 * a * a); // Circle area calculation
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.set(7); // Set radius for circle
        c.cal();   // Calculate and print area of circle
    }
}


