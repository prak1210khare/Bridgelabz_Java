/*Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.
Author: Prakhar Khare
Date: 1-10-2026
 */
package javaConstructors.level2;

public class CarRental {

    // Attributes
    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay;

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Not Selected";
        rentalDays = 0;
        pricePerDay = 0;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays, double pricePerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.pricePerDay = pricePerDay;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * pricePerDay;
    }

    // Method to display rental details
    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Price Per Day: " + pricePerDay);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {

        // Create object using parameterized constructor
        CarRental rental = new CarRental(
                "Prakhar",
                "Toyota Camry",
                5,
                2000
        );

        // Display rental details
        rental.displayDetails();
    }
}