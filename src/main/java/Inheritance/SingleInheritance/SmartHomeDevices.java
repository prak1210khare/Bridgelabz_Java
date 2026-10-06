/*Sample Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Author: Prakhar Khare
Date: 4-10-2026
 */
package Inheritance.SingleInheritance;

// Superclass
class Device {

    // Device attributes
    String deviceId;
    String status;

    // Constructor
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass
class Thermostat extends Device {

    // Thermostat attribute
    double temperatureSetting;

    // Constructor
    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus()
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class
public class SmartHomeDevices {

    public static void main(String[] args) {

        // Create Thermostat object
        Thermostat thermostat = new Thermostat(
                "TH001",
                "ON",
                24.5
        );

        // Display thermostat status
        thermostat.displayStatus();
    }
}