// Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

// Person class
class Person {
    // Properties
    private String firstName;
    private String lastName;

    // Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to get first name
    public String getFirstName() {
        return firstName;
    }

    // Method to get last name
    public String getLastName() {
        return lastName;
    }
}

// Employee subclass extending Person
class Employee extends Person {
    // Properties
    private int employeeId;
    private String jobTitle;

    // Constructor
    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    // Method to get employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Method to get last name including job title (override)
    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle; // Append job title to last name
    }
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John", "Doe", 12345, "Software Engineer");

        // Display employee information
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
