/*Sample Program 3: Employee Management System
Design an Employee class with the following features:
Static:
A static variable companyName shared by all employees.
A static method displayTotalEmployees() to show the total number of employees.
This:
Use this to initialize name, id, and designation in the constructor.
        Final:
Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof:
Check if a given object is an instance of the Employee class before printing the employee details.
Author: Prakhar Khare
Date: 1-10-2026
 */
package ThisStaticFinal;
class Employee {

    // Static variable shared by all employees
    static String companyName = "ABC Technologies";

    // Static variable to count employees
    static int totalEmployees = 0;

    // Instance variables
    String name;
    String designation;

    // Final variable
    final int id;

    // Constructor
    Employee(String name, int id, String designation) {

        // 'this' refers to the current object's variables
        this.name = name;
        this.id = id;
        this.designation = designation;

        // Increase employee count
        totalEmployees++;
    }

    // Static method to display total employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        // Create Employee objects
        Employee employee1 =
                new Employee("Prakhar", 101, "Software Developer");

        Employee employee2 =
                new Employee("Rahul", 102, "Java Developer");

        // Check if employee1 is an instance of Employee
        if (employee1 instanceof Employee) {
            System.out.println("Employee 1 is an instance of Employee.");
            employee1.displayDetails();
        }

        System.out.println();

        // Check if employee2 is an instance of Employee
        if (employee2 instanceof Employee) {
            System.out.println("Employee 2 is an instance of Employee.");
            employee2.displayDetails();
        }

        System.out.println();

        // Display total employees
        Employee.displayTotalEmployees();
    }
}
