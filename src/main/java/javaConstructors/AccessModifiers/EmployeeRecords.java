package javaConstructors.AccessModifiers;
class Employee {

    // Public variable
    public int employeeID;

    // Protected variable
    protected String department;

    // Private variable
    private double salary;

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }
}

// Subclass
class Manager extends Employee {

    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Demonstrate access to public and protected members
    void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class EmployeeRecords {

    public static void main(String[] args) {

        // Create Employee object
        Employee employee =
                new Employee(101, "Computer Science", 50000);

        // Access public employeeID directly
        System.out.println("Employee ID: " + employee.employeeID);

        // Modify private salary using public method
        employee.setSalary(60000);

        // Display updated salary
        System.out.println("Updated Salary: " + employee.getSalary());

        System.out.println();

        // Create Manager object
        Manager manager =
                new Manager(102, "Human Resources", 75000);

        // Access public and protected members
        manager.displayManagerDetails();
    }
}