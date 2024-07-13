// Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.

// Abstract class Employee
abstract class Employee {
    protected String name;
    protected int employeeId;

    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract methods to calculate salary and display information
    public abstract double calculateSalary();
    public abstract void displayInfo();
}

// Manager subclass extending Employee
class Manager extends Employee {
    protected double baseSalary;
    protected double bonus;

    // Constructor
    public Manager(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Implementation of calculateSalary method for Manager
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    // Implementation of displayInfo method for Manager
    @Override
    public void displayInfo() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Programmer subclass extending Employee
class Programmer_Abs extends Employee {
    protected double salaryPerHour;
    protected int hoursWorked;

    // Constructor
    public Programmer_Abs(String name, int employeeId, double salaryPerHour, int hoursWorked) {
        super(name, employeeId);
        this.salaryPerHour = salaryPerHour;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of calculateSalary method for Programmer
    @Override
    public double calculateSalary() {
        return salaryPerHour * hoursWorked;
    }

    // Implementation of displayInfo method for Programmer
    @Override
    public void displayInfo() {
        System.out.println("Programmer Information:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + calculateSalary());
    }
    public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager("John Doe", 1001, 50000, 10000);
        // Display Manager information
        manager.displayInfo();

        // Create a Programmer object
        Programmer_Abs programmer = new Programmer_Abs("Jane Smith", 2001, 50, 160);
        // Display Programmer information
        programmer.displayInfo();
    }
}
