/*Sample Program 5: University Student Management
Create a Student class to manage student data with the following features:
Static:
A static variable universityName shared across all students.
A static method displayTotalStudents() to show the number of students enrolled.
This:
Use this in the constructor to initialize name, rollNumber, and grade.
        Final:
Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
Author: Prakhar Khare
Date: 1-10-2026
 */
package ThisStaticFinal;
class Student {

    // Static variable shared by all students
    static String universityName = "SRM University";

    // Static variable to count total students
    static int totalStudents = 0;

    // Instance variables
    String name;
    String grade;

    // Final variable
    final int rollNumber;

    // Constructor
    Student(String name, int rollNumber, String grade) {

        // 'this' refers to the current object's variables
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        // Increase student count
        totalStudents++;
    }

    // Static method to display total students
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Method to update grade
    void updateGrade(String newGrade) {
        grade = newGrade;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

public class UniversityStudentManagement {

    public static void main(String[] args) {

        // Create Student objects
        Student student1 =
                new Student("Prakhar", 101, "A");

        Student student2 =
                new Student("Rahul", 102, "B");

        // Check if student1 is an instance of Student
        if (student1 instanceof Student) {
            System.out.println("Student 1 is valid.");
            student1.displayDetails();

            // Update grade
            student1.updateGrade("A+");

            System.out.println("\nAfter Updating Grade:");
            student1.displayDetails();
        }

        System.out.println();

        // Check if student2 is an instance of Student
        if (student2 instanceof Student) {
            System.out.println("Student 2 is valid.");
            student2.displayDetails();
        }

        System.out.println();

        // Display total number of students
        Student.displayTotalStudents();
    }
}
