/*Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
Author: Prakhar Khare
Date: 4-10-2026
 */
package Inheritance.HybridInheritance;
// Interface
interface Refuelable {

    // Abstract method
    void refuel();
}

// Superclass
class Vehicle {

    // Vehicle attributes
    double maxSpeed;
    String model;

    // Constructor
    Vehicle(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display vehicle details
    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Maximum Speed: " + maxSpeed + " km/h");
    }
}

// ElectricVehicle subclass
class ElectricVehicle extends Vehicle {

    // Constructor
    ElectricVehicle(double maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Method to charge the vehicle
    void charge() {
        System.out.println("Electric vehicle is charging.");
    }

    // Overriding displayDetails()
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Vehicle Type: Electric Vehicle");
    }
}

// PetrolVehicle subclass
class PetrolVehicle extends Vehicle implements Refuelable {

    // Constructor
    PetrolVehicle(double maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Implementing refuel() method
    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled.");
    }

    // Overriding displayDetails()
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Vehicle Type: Petrol Vehicle");
    }
}

// Main class
public class VehicleManagementSystem {

    public static void main(String[] args) {

        // Create ElectricVehicle object
        ElectricVehicle electricVehicle =
                new ElectricVehicle(200, "Tesla Model 3");

        // Create PetrolVehicle object
        PetrolVehicle petrolVehicle =
                new PetrolVehicle(180, "Toyota Camry");

        // Display Electric Vehicle details
        electricVehicle.displayDetails();
        electricVehicle.charge();

        System.out.println();

        // Display Petrol Vehicle details
        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
    }
}
