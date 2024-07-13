//We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.


// Abstract class Marks
abstract class Marks {
    abstract double getPercentage();
}

// Class A inheriting from Marks
class A extends Marks {
    int sub1, sub2, sub3;

    // Constructor for student A
    A(int s1, int s2, int s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    // Override getPercentage method to calculate percentage for student A
    double getPercentage() {
        return (sub1 + sub2 + sub3) / 3.0;
    }
}

// Class B inheriting from Marks
class B extends Marks {
    int sub1, sub2, sub3, sub4;

    // Constructor for student B
    B(int s1, int s2, int s3, int s4) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
    }

    // Override getPercentage method to calculate percentage for student B
    double getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) / 4.0;
    }
    public static void main(String[] args) {
        // Create object for student A with marks in three subjects
        A studentA = new A(80, 85, 90);
        // Calculate and print percentage of student A
        System.out.println("Percentage of Student A: " + studentA.getPercentage());

        // Create object for student B with marks in four subjects
        B studentB = new B(75, 80, 85, 90);
        // Calculate and print percentage of student B
        System.out.println("Percentage of Student B: " + studentB.getPercentage());
    }
}

