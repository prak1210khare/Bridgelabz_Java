/*7. Hospital Patient Management
Description: Design a system to manage patients in a hospital:
Create an abstract class Patient with fields like patientId, name, and age.
Add an abstract method calculateBill() and a concrete method getPatientDetails().
Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
Implement an interface MedicalRecord with methods addRecord() and viewRecords().
Use encapsulation to protect sensitive patient data like diagnosis and medical history.
Use polymorphism to handle different patient types and display their billing details dynamically.
Author: Prakhar Khare
Date: 5-10-2026
 */

package EncapsulationPolymorphismInterface;
import java.util.ArrayList;
import java.util.List;

// Interface
interface MedicalRecord {

    void addRecord(String record);

    void viewRecords();
}

// Abstract class
abstract class Patient {

    // Common patient fields
    private int patientId;
    private String name;
    private int age;

    // Constructor
    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method
    abstract double calculateBill();

    // Concrete method
    void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
    }
}

// InPatient subclass
class InPatient extends Patient implements MedicalRecord {

    // Private fields for sensitive data
    private String diagnosis;
    private String medicalHistory;

    // Unique attributes
    private int daysAdmitted;
    private double dailyRoomCharge;

    // Medical records
    private List<String> records = new ArrayList<>();

    // Constructor
    InPatient(int patientId, String name, int age,
              String diagnosis, String medicalHistory,
              int daysAdmitted, double dailyRoomCharge) {

        super(patientId, name, age);

        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
        this.daysAdmitted = daysAdmitted;
        this.dailyRoomCharge = dailyRoomCharge;
    }

    // Calculate bill for inpatient
    @Override
    double calculateBill() {
        return daysAdmitted * dailyRoomCharge + 2000;
    }

    // Add medical record
    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    // View medical records
    @Override
    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }

    // Getter for diagnosis
    public String getDiagnosis() {
        return diagnosis;
    }

    // Setter for diagnosis
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Getter for medical history
    public String getMedicalHistory() {
        return medicalHistory;
    }

    // Setter for medical history
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}

// OutPatient subclass
class OutPatient extends Patient implements MedicalRecord {

    // Private fields for sensitive data
    private String diagnosis;
    private String medicalHistory;

    // Unique attribute
    private double consultationFee;

    // Medical records
    private List<String> records = new ArrayList<>();

    // Constructor
    OutPatient(int patientId, String name, int age,
               String diagnosis, String medicalHistory,
               double consultationFee) {

        super(patientId, name, age);

        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
        this.consultationFee = consultationFee;
    }

    // Calculate bill for outpatient
    @Override
    double calculateBill() {
        return consultationFee + 500;
    }

    // Add medical record
    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    // View medical records
    @Override
    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }

    // Getter for diagnosis
    public String getDiagnosis() {
        return diagnosis;
    }

    // Setter for diagnosis
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Getter for medical history
    public String getMedicalHistory() {
        return medicalHistory;
    }

    // Setter for medical history
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}

// Main class
public class HospitalPatientManagement {

    public static void main(String[] args) {

        // Create InPatient
        InPatient inPatient = new InPatient(
                101,
                "Prakhar",
                21,
                "Fever",
                "Previous history of viral infection",
                5,
                3000
        );

        // Create OutPatient
        OutPatient outPatient = new OutPatient(
                102,
                "Rahul",
                25,
                "Cold",
                "No major medical history",
                1000
        );

        // Add medical records
        inPatient.addRecord("Blood test completed");
        inPatient.addRecord("Temperature monitored");

        outPatient.addRecord("General consultation completed");

        // Create Patient list
        List<Patient> patients = new ArrayList<>();

        patients.add(inPatient);
        patients.add(outPatient);

        // Polymorphism
        for (Patient patient : patients) {

            patient.getPatientDetails();

            // Calculate bill dynamically
            double bill = patient.calculateBill();

            System.out.println("Total Bill: " + bill);

            System.out.println();
        }

        // View medical records
        System.out.println("InPatient Records:");
        inPatient.viewRecords();

        System.out.println();

        System.out.println("OutPatient Records:");
        outPatient.viewRecords();
    }
}