// rite a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service

import java.time.LocalDate;
import java.time.Period;

public class Employee_oop {
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor
    public Employee_oop(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Method to calculate years of service
    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an employee object
        Employee_oop employee = new Employee_oop("John Doe", 50000, LocalDate.of(2015, 8, 15));

        // Calculate and print years of service
        int yearsOfService = employee.calculateYearsOfService();
        System.out.println("Years of service: " + yearsOfService);
    }
}
