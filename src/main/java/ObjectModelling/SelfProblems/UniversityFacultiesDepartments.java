/*Problem 2: University with Faculties and Departments (Composition and Aggregation)
Description: Create a University with multiple Faculty members and Department objects. Model it so that the University and its Departments are in a composition relationship (deleting a university deletes all departments), and the Faculty members are in an aggregation relationship (faculty can exist outside of any specific department).
Tasks:
Define a University class with Department and Faculty classes.
Demonstrate how deleting a University also deletes its Departments.
Show that Faculty members can exist independently of a Department.
Author: Prakhar Khare
Date: 5-10-2026
 */
package ObjectModelling.SelfProblems;
import java.util.ArrayList;

// Faculty class
// Faculty can exist independently of a University or Department
class Faculty1 {

    private int facultyId;
    private String facultyName;
    private String specialization;

    // Constructor
    Faculty1(int facultyId, String facultyName, String specialization) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.specialization = specialization;
    }

    // Display faculty details
    public void displayDetails() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Specialization: " + specialization);
    }

    public String getFacultyName() {
        return facultyName;
    }
}


// Department class
// Department is created and owned by University
class Department1 {

    private String departmentName;

    // Department has faculty members
    private ArrayList<Faculty1> facultyMembers;

    // Constructor
    Department1(String departmentName) {
        this.departmentName = departmentName;
        facultyMembers = new ArrayList<>();
    }

    // Add existing faculty to department
    public void addFaculty(Faculty1 faculty) {
        facultyMembers.add(faculty);
    }

    // Display department details
    public void displayDetails() {

        System.out.println("Department: " + departmentName);
        System.out.println("Faculty Members:");

        for (Faculty1 faculty : facultyMembers) {
            System.out.println(
                    "- " + faculty.getFacultyName()
            );
        }
    }
}


// University class
class University1 {

    private String universityName;

    // Composition:
    // University owns its departments
    private ArrayList<Department1> departments;

    // Constructor
    University1(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
    }

    // Create and add a department
    public void addDepartment(String departmentName) {

        // Department is created inside University
        Department1 department =
                new Department1(departmentName);

        departments.add(department);
    }

    // Add faculty to a particular department
    public void addFacultyToDepartment(
            int departmentIndex,
            Faculty1 faculty) {

        departments.get(departmentIndex)
                .addFaculty(faculty);
    }

    // Display university details
    public void displayUniversityDetails() {

        System.out.println("University: " + universityName);
        System.out.println("======================");

        for (Department1 department : departments) {
            department.displayDetails();
            System.out.println();
        }
    }
}


// Main class
public class UniversityFacultiesDepartments {

    public static void main(String[] args) {

        // Faculty objects are created independently
        Faculty1 faculty1 =
                new Faculty1(
                        101,
                        "Dr. Prakhar",
                        "Computer Science"
                );

        Faculty1 faculty2 =
                new Faculty1(
                        102,
                        "Dr. Rahul",
                        "Mathematics"
                );

        Faculty1 faculty3 =
                new Faculty1(
                        103,
                        "Dr. Amit",
                        "Physics"
                );

        // Create University
        University1 university =
                new University1("SRM University");

        // Departments are created through University
        university.addDepartment("Computer Science");
        university.addDepartment("Mathematics");

        // Add existing faculty members to departments
        university.addFacultyToDepartment(
                0, faculty1);

        university.addFacultyToDepartment(
                1, faculty2);

        // Faculty can also exist independently
        System.out.println("Independent Faculty");
        System.out.println("===================");

        faculty3.displayDetails();

        System.out.println();

        // Display University
        System.out.println("University Details");
        System.out.println("==================");

        university.displayUniversityDetails();

        // University is no longer referenced
        university = null;

        System.out.println(
                "University object is no longer referenced."
        );

        System.out.println(
                "Its departments are now eligible for garbage collection."
        );

        System.out.println(
                "Faculty objects can still exist independently."
        );

        // Faculty still exists after University is removed
        System.out.println();
        System.out.println("Faculty After University Removal");
        System.out.println("===============================");

        faculty1.displayDetails();
        System.out.println();

        faculty3.displayDetails();
    }
}
