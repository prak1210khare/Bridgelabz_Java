/*8. Ride-Hailing Application
Description: Develop a ride-hailing application:
Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
Use an interface GPS with methods getCurrentLocation() and updateLocation().
Secure driver and vehicle details using encapsulation.
Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.
Author: Prakhar Khare
Date: 5-10-2026
 */

package EncapsulationPolymorphismInterface;
import java.util.ArrayList;
import java.util.List;

// GPS interface
interface GPS1 {

    // Get current location
    String getCurrentLocation();

    // Update current location
    void updateLocation(String newLocation);
}

// Abstract Vehicle class
abstract class Vehicle1 {

    // Private fields for encapsulation
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    Vehicle1(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Setters
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Abstract method
    abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate Per Km: " + ratePerKm);
    }
}

// Car class
class Car1 extends Vehicle1 implements GPS1 {

    private String currentLocation;

    Car1(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Bike class
class Bike1 extends Vehicle1 implements GPS1 {

    private String currentLocation;

    Bike1(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Auto class
class Auto1 extends Vehicle1 implements GPS1 {

    private String currentLocation;

    Auto1(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Main class
public class RideHailingApplication {

    // Polymorphic method to calculate fare
    public static void calculateFareForVehicles(
            List<Vehicle1> vehicles, double distance) {

        for (Vehicle1 vehicle : vehicles) {

            double fare = vehicle.calculateFare(distance);

            System.out.println("Vehicle ID: " + vehicle.getVehicleId());
            System.out.println("Driver Name: " + vehicle.getDriverName());
            System.out.println("Fare for " + distance + " km: " + fare);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create different types of vehicles
        Car1 car = new Car1(
                101,
                "Prakhar",
                15,
                "Chennai"
        );

        Bike1 bike = new Bike1(
                102,
                "Rahul",
                8,
                "Tambaram"
        );

        Auto1 auto = new Auto1(
                103,
                "Amit",
                12,
                "Guindy"
        );

        // Create list using Vehicle1 reference
        List<Vehicle1> vehicles = new ArrayList<>();

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Display vehicle details
        System.out.println("Vehicle Details");
        System.out.println("----------------");

        for (Vehicle1 vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println();
        }

        // Calculate fares
        System.out.println("Ride Fare Details");
        System.out.println("-----------------");

        calculateFareForVehicles(vehicles, 10);

        // Demonstrate GPS functionality
        System.out.println("Current Car Location: "
                + car.getCurrentLocation());

        car.updateLocation("Velachery");

        System.out.println("Updated Car Location: "
                + car.getCurrentLocation());
    }
}