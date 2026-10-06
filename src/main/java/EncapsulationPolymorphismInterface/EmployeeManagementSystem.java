/*1. Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
Author: Prakhar Khare
Date: 5-10-2026
 */
package EncapsulationPolymorphismInterface;
import java.util.ArrayList;
import java.util.List;

// Interface
interface Department {

    void assignDepartment(String department);

    String getDepartmentDetails();
}

// Abstract class
abstract class Employee {

    // Private fields for encapsulation
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter for employeeId
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for baseSalary
    public double getBaseSalary() {
        return baseSalary;
    }

    // Setter for baseSalary
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}

// Full-time employee
class FullTimeEmployee extends Employee implements Department {

    // Unique attribute
    private String department;

    // Constructor
    FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    // Implementing calculateSalary()
    @Override
    double calculateSalary() {
        return getBaseSalary();
    }

    // Assign department
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    // Get department details
    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// Part-time employee
class PartTimeEmployee extends Employee implements Department {

    // Unique attributes
    private double hourlyRate;
    private int workHours;
    private String department;

    // Constructor
    PartTimeEmployee(int employeeId, String name,
                     double hourlyRate, int workHours) {

        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    // Implementing calculateSalary()
    @Override
    double calculateSalary() {
        return hourlyRate * workHours;
    }

    // Assign department
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    // Get department details
    @Override
    public String getDepartmentDetails() {
        return department;
    }

    // Getter for hourlyRate
    public double getHourlyRate() {
        return hourlyRate;
    }

    // Setter for hourlyRate
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Getter for workHours
    public int getWorkHours() {
        return workHours;
    }

    // Setter for workHours
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}

// Main class
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Create FullTimeEmployee object
        FullTimeEmployee fullTimeEmployee =
                new FullTimeEmployee(
                        101,
                        "Prakhar",
                        60000
                );

        // Create PartTimeEmployee object
        PartTimeEmployee partTimeEmployee =
                new PartTimeEmployee(
                        102,
                        "Rahul",
                        500,
                        80
                );

        // Assign departments
        fullTimeEmployee.assignDepartment("IT");
        partTimeEmployee.assignDepartment("HR");

        // Polymorphism:
        // Employee reference can store different employee objects
        List<Employee> employees = new ArrayList<>();

        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Process employees
        for (Employee employee : employees) {

            employee.displayDetails();

            // Check department details
            if (employee instanceof Department) {
                Department department =
                        (Department) employee;

                System.out.println(
                        "Department: "
                                + department.getDepartmentDetails()
                );
            }

            System.out.println();
        }
    }
}