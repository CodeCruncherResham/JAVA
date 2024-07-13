// Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return name + " (Teaching: " + subject + ")";
    }
}

class School {
    private List<Student> students;
    private List<Teacher> teachers;
    private List<String> classes;

    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void createClass(String className) {
        classes.add(className);
    }

    public void removeClass(String className) {
        classes.remove(className);
    }

    public void displayStudents() {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayTeachers() {
        System.out.println("Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void displayClasses() {
        System.out.println("Classes:");
        for (String className : classes) {
            System.out.println(className);
        }
    }
    public static void main(String[] args) {
        School school = new School();

        // Add students
        school.addStudent(new Student("Alice", 15));
        school.addStudent(new Student("Bob", 16));

        // Add teachers
        school.addTeacher(new Teacher("Mr. Smith", "Math"));
        school.addTeacher(new Teacher("Ms. Johnson", "Science"));

        // Create classes
        school.createClass("Math Class");
        school.createClass("Science Class");

        // Display students, teachers, and classes
        school.displayStudents();
        school.displayTeachers();
        school.displayClasses();
    }
}
