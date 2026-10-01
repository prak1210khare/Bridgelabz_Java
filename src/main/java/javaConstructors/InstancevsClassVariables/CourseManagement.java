/*Problem 2: Online Course Management
Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses.
Author: Prakhar Khare
Date: 1-10-2026
 */
package javaConstructors.InstancevsClassVariables;

class Course {

    // Instance variables
    String courseName;
    int duration;
    double fee;

    // Class variable
    static String instituteName = "ABC Institute";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method
    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

public class CourseManagement {
    public static void main(String[] args) {

        // Create Course objects
        Course course1 = new Course("Java Programming", 6, 25000);
        Course course2 = new Course("Python Programming", 4, 20000);

        // Display course details before updating institute name
        System.out.println("Before Updating Institute Name:");

        course1.displayCourseDetails();

        System.out.println();

        course2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("SRM Training Institute");

        System.out.println();
        System.out.println("After Updating Institute Name:");

        course1.displayCourseDetails();

        System.out.println();

        course2.displayCourseDetails();
    }}

