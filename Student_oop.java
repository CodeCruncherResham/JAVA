//  Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
import java.util.ArrayList;
import java.util.List;

class Student_oop {
    private String name;
    private int grade;
    private List<String> courses;

    public Student_oop(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
        System.out.println("Course added: " + course);
    }

    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println("Course removed: " + course);
        } else {
            System.out.println("Course not found: " + course);
        }
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }

    public static void main(String[] args) {
        // Creating a student
        Student_oop student1 = new Student_oop("John", 10);

        // Adding courses
        student1.addCourse("Math");
        student1.addCourse("Science");
        student1.addCourse("History");

        // Displaying courses
        student1.displayCourses();

        // Removing a course
        student1.removeCourse("Science");

        // Displaying courses after removal
        student1.displayCourses();
    }
}
