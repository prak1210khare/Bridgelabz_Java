/*Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Author: Prakhar Khare
Date: 4-10-2026
 */
package Inheritance.HierarchicalInheritance;
// Superclass
class Person {

    // Common attributes
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to display role
    void displayRole() {
        System.out.println("Role: Person");
    }
}

// Teacher subclass
class Teacher extends Person {

    // Unique attribute
    String subject;

    // Constructor
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding displayRole()
    @Override
    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Student subclass
class Student extends Person {

    // Unique attribute
    String grade;

    // Constructor
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Overriding displayRole()
    @Override
    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Staff subclass
class Staff extends Person {

    // Unique attribute
    String department;

    // Constructor
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Overriding displayRole()
    @Override
    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Main class
public class SchoolSystem {

    public static void main(String[] args) {

        // Create Teacher object
        Teacher teacher = new Teacher(
                "Prakhar",
                30,
                "Computer Science"
        );

        // Create Student object
        Student student = new Student(
                "Rahul",
                20,
                "Grade A"
        );

        // Create Staff object
        Staff staff = new Staff(
                "Amit",
                35,
                "Administration"
        );

        // Display Teacher details
        teacher.displayDetails();
        teacher.displayRole();

        System.out.println();

        // Display Student details
        student.displayDetails();
        student.displayRole();

        System.out.println();

        // Display Staff details
        staff.displayDetails();
        staff.displayRole();
    }
}
