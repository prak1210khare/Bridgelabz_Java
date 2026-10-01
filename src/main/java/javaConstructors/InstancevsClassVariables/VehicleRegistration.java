/*Problem 3: Vehicle Registration
Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee.
Author: Prakhar Khare
Date: 1-10-2026
 */

package javaConstructors.InstancevsClassVariables;
class Vehicle {

    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable
    static double registrationFee = 5000;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {

        // Create Vehicle objects
        Vehicle vehicle1 = new Vehicle("Prakhar", "Car");
        Vehicle vehicle2 = new Vehicle("Rahul", "Bike");

        // Display details before updating fee
        System.out.println("Before Updating Registration Fee:");

        vehicle1.displayVehicleDetails();

        System.out.println();

        vehicle2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(7500);

        System.out.println();
        System.out.println("After Updating Registration Fee:");

        vehicle1.displayVehicleDetails();

        System.out.println();

        vehicle2.displayVehicleDetails();
    }
}
