/*Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.
Author: Prakhar Khare
Date: 1-10-2026
 */

package ClassandObject.level1;
class Employee {
    // Employee attributes
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeDetails{
    public static void main(String[] args) {

        // Create an Employee object
        Employee employee = new Employee("Prakhar", 101, 50000);

        // Display employee details
        employee.displayDetails();
    }
}