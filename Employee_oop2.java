//  Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
public class Employee_oop2 {
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee_oop2(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Method to calculate salary
    public void calculateSalary(double bonusPercentage) {
        double bonus = (bonusPercentage / 100) * salary;
        salary += bonus;
        System.out.println("Salary calculated successfully. New salary: " + salary);
    }

    // Method to update salary
    public void updateSalary(double newSalary) {
        salary = newSalary;
        System.out.println("Salary updated successfully. New salary: " + salary);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Create an Employee object
        Employee_oop2 employee = new Employee_oop2("John Doe", "Software Engineer", 50000);

        // Calculate and update salary
        employee.calculateSalary(10); // 10% bonus
        employee.updateSalary(55000); // New salary
    }
}
