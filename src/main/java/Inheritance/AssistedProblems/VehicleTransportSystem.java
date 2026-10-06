/*Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Auhtor: Prakhar Khare
Date: 4-10-2026
 */
package Inheritance.AssistedProblems;
// Superclass
class Vehicle {

    // Vehicle attributes
    double maxSpeed;
    String fuelType;

    // Constructor
    Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information
    void displayInfo() {
        System.out.println("Maximum Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Car subclass
class Car extends Vehicle {

    // Unique attribute
    int seatCapacity;

    // Constructor
    Car(double maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo()
    @Override
    void displayInfo() {
        System.out.println("Vehicle Type: Car");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Truck subclass
class Truck extends Vehicle {

    // Unique attribute
    double loadCapacity;

    // Constructor
    Truck(double maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Overriding displayInfo()
    @Override
    void displayInfo() {
        System.out.println("Vehicle Type: Truck");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {

    // Unique attribute
    boolean hasGear;

    // Constructor
    Motorcycle(double maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    // Overriding displayInfo()
    @Override
    void displayInfo() {
        System.out.println("Vehicle Type: Motorcycle");
        super.displayInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}

// Main class
public class VehicleTransportSystem {

    public static void main(String[] args) {

        // Create objects of different subclasses
        Car car = new Car(180, "Petrol", 5);

        Truck truck = new Truck(120, "Diesel", 10);

        Motorcycle motorcycle = new Motorcycle(150, "Petrol", true);

        // Store different subclass objects in Vehicle array
        Vehicle[] vehicles = {car, truck, motorcycle};

        // Demonstrate polymorphism
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
