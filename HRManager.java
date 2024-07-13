//Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

// Parent class Employee
class Employee {
    // Method to perform work
    void work() {
        System.out.println("Employee is working...");
    }

    // Method to get salary
    double getSalary() {
        return 0.0;
    }
}

// Subclass HRManager extending Employee
class HRManager extends Employee {
    // Override work method
    void work() {
        System.out.println("HR Manager is managing human resources...");
    }

    // Method to add employee
    void addEmployee() {
        System.out.println("HR Manager is adding a new employee...");
    }
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();
        // Call work method of Employee
        emp.work();
        // Call getSalary method of Employee and print salary
        System.out.println("Employee Salary: $" + emp.getSalary());

        // Create an HRManager object
        HRManager hrManager = new HRManager();
        // Call work method of HRManager
        hrManager.work();
        // Call getSalary method of HRManager and print salary
        System.out.println("HR Manager Salary: $" + hrManager.getSalary());
        // Call addEmployee method of HRManager
        hrManager.addEmployee();
    }
}

