class M {
    protected int rollno;
    protected String name;

    public void set(int r, String n) {
        rollno = r;
        name = n;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }
}

class Marks extends M {
    float m1, m2, m3;

    public void set(int r, String n, float x, float y, float z) {
        super.set(r, n); // Call set method of parent class to set roll number and name
        m1 = x;
        m2 = y;
        m3 = z;
    }

    public void display() {
        System.out.println("Roll No: " + getRollno());
        System.out.println("Name: " + getName());
        System.out.println("Marks:");
        System.out.println("  m1: " + m1);
        System.out.println("  m2: " + m2);
        System.out.println("  m3: " + m3);
    }

    public static void main(String[] args) {
        Marks s1 = new Marks(); // Create object of Marks class
        s1.set(102, "AS", 20, 30, 40); // Set roll number, name, and marks
        s1.display(); // Display student information and marks
    }
}
