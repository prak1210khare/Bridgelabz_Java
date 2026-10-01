/*2. Access Modifiers
Problem 1: University Management System
Create a Student class with:
rollNumber (public).
name (protected).
CGPA (private).
Write methods to:
Access and modify CGPA using public methods.
Create a subclass PostgraduateStudent to demonstrate the use of protected members.
Author: Prakhar Khare
Date: 1-10-2026
 */

package javaConstructors.AccessModifiers;
class Student {

    // Public variable
    public int rollNumber;

    // Protected variable
    protected String name;

    // Private variable
    private double CGPA;

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access private CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify private CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass
class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Demonstrating access to protected member
    void displayProtectedName() {
        System.out.println("Protected Name: " + name);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {

        // Create Student object
        Student student = new Student(101, "Prakhar", 8.5);

        // Public member can be accessed directly
        System.out.println("Roll Number: " + student.rollNumber);

        // Private CGPA is accessed using public methods
        System.out.println("Initial CGPA: " + student.getCGPA());

        // Modify CGPA using setter method
        student.setCGPA(9.0);

        System.out.println("Updated CGPA: " + student.getCGPA());

        System.out.println();

        // Create PostgraduateStudent object
        PostgraduateStudent postgraduateStudent =
                new PostgraduateStudent(102, "Rahul", 8.8);

        // Access protected member through subclass method
        postgraduateStudent.displayProtectedName();
    }
}