/*Problem 1: School and Students with Courses (Association and Aggregation)
Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
Tasks:
        Define School, Student, and Course classes.
Model an association between Student and Course to show that students can enroll in multiple courses.
Model an aggregation relationship between School and Student.
Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
Author: Prakhar Khare
Date: 5-10-2026
 */

package ObjectModelling.SelfProblems;
import java.util.ArrayList;

// Course class
class Course1 {

    private String courseName;
    private String courseCode;

    // Multiple students can enroll in one course
    private ArrayList<Student1> students;

    // Constructor
    Course1(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        students = new ArrayList<>();
    }

    // Add student to course
    public void addStudent(Student1 student) {

        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display students enrolled in the course
    public void displayEnrolledStudents() {

        System.out.println("Course: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Enrolled Students:");

        for (Student1 student : students) {
            System.out.println(
                    student.getStudentName()
                            + " (ID: "
                            + student.getStudentId()
                            + ")"
            );
        }
    }

    public String getCourseName() {
        return courseName;
    }
}


// Student class
class Student1 {

    private int studentId;
    private String studentName;

    // A student can enroll in multiple courses
    private ArrayList<Course1> courses;

    // Constructor
    Student1(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    // Enroll student in a course
    public void enrollCourse(Course1 course) {

        if (!courses.contains(course)) {
            courses.add(course);

            // Create association between student and course
            course.addStudent(this);
        }
    }

    // Display courses of the student
    public void displayCourses() {

        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Enrolled Courses:");

        for (Course1 course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}


// School class
class School1 {

    private String schoolName;

    // Aggregation: School has students
    private ArrayList<Student1> students;

    // Constructor
    School1(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    // Add an existing student to the school
    public void addStudent(Student1 student) {
        students.add(student);
    }

    // Display students
    public void displayStudents() {

        System.out.println("School: " + schoolName);
        System.out.println("Students:");

        for (Student1 student : students) {
            System.out.println(
                    student.getStudentName()
                            + " (ID: "
                            + student.getStudentId()
                            + ")"
            );
        }
    }
}


// Main class
public class SchoolStudentsCourses {

    public static void main(String[] args) {

        // Create students independently
        Student1 student1 =
                new Student1(101, "Prakhar");

        Student1 student2 =
                new Student1(102, "Rahul");

        Student1 student3 =
                new Student1(103, "Amit");

        // Create courses independently
        Course1 javaCourse =
                new Course1("Java Programming", "JAVA101");

        Course1 databaseCourse =
                new Course1("Database Management", "DB101");

        Course1 networkingCourse =
                new Course1("Computer Networking", "CN101");

        // Create school
        School1 school =
                new School1("SRM School");

        // Add existing students to school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Student 1 enrolls in multiple courses
        student1.enrollCourse(javaCourse);
        student1.enrollCourse(databaseCourse);
        student1.enrollCourse(networkingCourse);

        // Student 2 enrolls in multiple courses
        student2.enrollCourse(javaCourse);
        student2.enrollCourse(databaseCourse);

        // Student 3 enrolls in courses
        student3.enrollCourse(javaCourse);
        student3.enrollCourse(networkingCourse);

        // Display school students
        System.out.println("School Details");
        System.out.println("==============");

        school.displayStudents();

        // Display courses of Student 1
        System.out.println();
        System.out.println("Student Course Details");
        System.out.println("======================");

        student1.displayCourses();

        // Display students of Java course
        System.out.println();
        System.out.println("Course Student Details");
        System.out.println("======================");

        javaCourse.displayEnrolledStudents();

        // Display students of Database course
        System.out.println();
        databaseCourse.displayEnrolledStudents();
    }
}
