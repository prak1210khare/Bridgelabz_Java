/*Sample Program 7: Hospital Management System
Create a Patient class with the following features:
Static:
A static variable hospitalName shared among all patients.
A static method getTotalPatients() to count the total patients admitted.
This:
Use this to initialize name, age, and ailment in the constructor.
        Final:
Use a final variable patientID to uniquely identify each patient.
        Instanceof:
Check if an object is an instance of the Patient class before displaying its details
Author: Prakhar Khare
Date: 1-10-2026
 */

package ThisStaticFinal;
class Patient {

    // Static variable shared by all patients
    static String hospitalName = "City Care Hospital";

    // Static variable to count total patients
    static int totalPatients = 0;

    // Instance variables
    String name;
    int age;
    String ailment;

    // Final variable
    final int patientID;

    // Constructor
    Patient(String name, int age, String ailment, int patientID) {

        // 'this' refers to the current object's variables
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        // Increase patient count
        totalPatients++;
    }

    // Static method to display total patients
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details
    void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient Name: " + name);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}

public class HospitalManagement {

    public static void main(String[] args) {

        // Create Patient objects
        Patient patient1 =
                new Patient("Prakhar", 21, "Fever", 101);

        Patient patient2 =
                new Patient("Rahul", 25, "Cold", 102);

        // Check if patient1 is an instance of Patient
        if (patient1 instanceof Patient) {
            System.out.println("Patient 1 is valid.");
            patient1.displayDetails();
        }

        System.out.println();

        // Check if patient2 is an instance of Patient
        if (patient2 instanceof Patient) {
            System.out.println("Patient 2 is valid.");
            patient2.displayDetails();
        }

        System.out.println();

        // Display total patients
        Patient.getTotalPatients();
    }
}