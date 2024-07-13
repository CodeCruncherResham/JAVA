// Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.

// Base class Employee
class Employee {
    // Properties
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    // Constructor
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Method to calculate bonus (default implementation)
    public double calculateBonus() {
        return salary * 0.05; // Default bonus calculation: 5% of salary
    }

    // Method to generate performance report (default implementation)
    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + ": Excellent");
    }

    // Method to manage projects (default implementation)
    public void manageProjects() {
        System.out.println("Projects managed by " + name + ": Project A, Project B");
    }
}

// Subclass Manager extending Employee
class Manager extends Employee {
    // Constructor
    public Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    // Method to calculate bonus (override)
    public double calculateBonus() {
        return salary * 0.1; // Manager bonus calculation: 10% of salary
    }

    // Method to generate performance report (override)
    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + ": Outstanding");
    }

    // Method to manage projects (override)
    public void manageProjects() {
        System.out.println("Projects managed by " + name + ": All projects");
    }
}

// Subclass Developer extending Employee
class Developer extends Employee {
    // Constructor
    public Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    // Method to calculate bonus (override)
    public double calculateBonus() {
        return salary * 0.08; // Developer bonus calculation: 8% of salary
    }
}

// Subclass Programmer extending Employee
class Programmer extends Employee {
    // Constructor
    public Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    // Method to generate performance report (override)
    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + ": Good");
    }
    public static void main(String[] args) {
        // Create objects for different types of employees
        Manager manager = new Manager("John Doe", "123 Main St", 80000, "Manager");
        Developer developer = new Developer("Jane Smith", "456 Oak Ave", 70000, "Developer");
        Programmer programmer = new Programmer("Tom Brown", "789 Elm St", 60000, "Programmer");

        // Calculate and print bonuses for each employee
        System.out.println("Bonus for " + manager.name + ": $" + manager.calculateBonus());
        System.out.println("Bonus for " + developer.name + ": $" + developer.calculateBonus());
        System.out.println("Bonus for " + programmer.name + ": $" + programmer.calculateBonus());

        // Generate performance reports for each employee
        manager.generatePerformanceReport();
        developer.generatePerformanceReport();
        programmer.generatePerformanceReport();

        // Manage projects for each employee
        manager.manageProjects();
        developer.manageProjects();
        programmer.manageProjects();
    }
}

