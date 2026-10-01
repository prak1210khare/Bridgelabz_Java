/*Sample Program 6: Vehicle Registration System
Create a Vehicle class with the following features:
Static:
A static variable registrationFee common for all vehicles.
A static method updateRegistrationFee() to modify the fee.
This:
Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
        Final:
Use a final variable registrationNumber to uniquely identify each vehicle.
        Instanceof:
Check if an object belongs to the Vehicle class before displaying its registration details.
Author: Prakhar Khare
Date: 1-10-2026
 */
package ThisStaticFinal;
class Vehicle {

    // Static variable shared by all vehicles
    static double registrationFee = 5000;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Final variable
    final String registrationNumber;

    // Constructor
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {

        // 'this' refers to the current object's variables
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle details
    void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
}

public class VehicleRegistration {

    public static void main(String[] args) {

        // Create Vehicle objects
        Vehicle vehicle1 =
                new Vehicle("Prakhar", "Car", "TN01AB1234");

        Vehicle vehicle2 =
                new Vehicle("Rahul", "Bike", "TN02CD5678");

        // Check if vehicle1 is an instance of Vehicle
        if (vehicle1 instanceof Vehicle) {
            System.out.println("Vehicle 1 is valid.");
            vehicle1.displayDetails();
        }

        System.out.println();

        // Check if vehicle2 is an instance of Vehicle
        if (vehicle2 instanceof Vehicle) {
            System.out.println("Vehicle 2 is valid.");
            vehicle2.displayDetails();
        }

        System.out.println();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(7500);

        System.out.println("After Updating Registration Fee:");

        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayDetails();
        }

        System.out.println();

        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayDetails();
        }
    }
}
