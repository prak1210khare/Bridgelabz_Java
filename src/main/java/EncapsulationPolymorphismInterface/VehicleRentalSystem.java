/*3. Vehicle Rental System
Description: Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
Author: Prakhar Khare
Date: 5-10-2026
 */

package EncapsulationPolymorphismInterface;
import java.util.ArrayList;
import java.util.List;

// Interface
interface Insurable {

    double calculateInsurance();

    String getInsuranceDetails();
}

// Abstract class
abstract class Vehicle {

    // Private fields for encapsulation
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getter for vehicleNumber
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    // Setter for vehicleNumber
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }

    // Getter for rentalRate
    public double getRentalRate() {
        return rentalRate;
    }

    // Setter for rentalRate
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method
    abstract double calculateRentalCost(int days);

    // Concrete method
    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Rental Rate Per Day: " + rentalRate);
    }
}

// Car subclass
class Car extends Vehicle implements Insurable {

    // Sensitive insurance policy number
    private String insurancePolicyNumber;

    // Constructor
    Car(String vehicleNumber, double rentalRate,
        String insurancePolicyNumber) {

        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Calculate rental cost
    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Calculate insurance
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 10 / 100;
    }

    // Get insurance details
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}

// Bike subclass
class Bike extends Vehicle implements Insurable {

    // Sensitive insurance policy number
    private String insurancePolicyNumber;

    // Constructor
    Bike(String vehicleNumber, double rentalRate,
         String insurancePolicyNumber) {

        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Calculate rental cost
    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Calculate insurance
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 5 / 100;
    }

    // Get insurance details
    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}

// Truck subclass
class Truck extends Vehicle implements Insurable {

    // Sensitive insurance policy number
    private String insurancePolicyNumber;

    // Constructor
    Truck(String vehicleNumber, double rentalRate,
          String insurancePolicyNumber) {

        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Calculate rental cost
    @Override
    double calculateRentalCost(int days) {
        // Truck has an additional fixed charge
        return (getRentalRate() * days) + 2000;
    }

    // Calculate insurance
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 15 / 100;
    }

    // Get insurance details
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}

// Main class
public class VehicleRentalSystem {

    // Method to process all vehicles
    static void processRentals(List<Vehicle> vehicles, int days) {

        for (Vehicle vehicle : vehicles) {

            // Display vehicle details
            vehicle.displayDetails();

            // Calculate rental cost
            double rentalCost = vehicle.calculateRentalCost(days);

            System.out.println("Rental Days: " + days);
            System.out.println("Rental Cost: " + rentalCost);

            // Check whether vehicle is insurable
            if (vehicle instanceof Insurable) {

                Insurable insurableVehicle =
                        (Insurable) vehicle;

                double insuranceCost =
                        insurableVehicle.calculateInsurance();

                System.out.println(
                        insurableVehicle.getInsuranceDetails()
                );

                System.out.println(
                        "Insurance Cost: " + insuranceCost
                );
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create Car object
        Car car = new Car(
                "TN01AB1234",
                2000,
                "CAR-INS-101"
        );

        // Create Bike object
        Bike bike = new Bike(
                "TN02CD5678",
                800,
                "BIKE-INS-102"
        );

        // Create Truck object
        Truck truck = new Truck(
                "TN03EF9012",
                5000,
                "TRUCK-INS-103"
        );

        // Create Vehicle list
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Process rentals for 5 days
        processRentals(vehicles, 5);
    }
}