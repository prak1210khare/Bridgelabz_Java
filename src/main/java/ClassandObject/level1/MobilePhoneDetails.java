/*Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information for each object.
Author: Prakhar Khare
Date: 1-10-2026
 */
package ClassandObject.level1;
class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {

        // Create MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 70000);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24", 65000);

        // Display details of each object
        System.out.println("Mobile Phone 1:");
        phone1.displayDetails();

        System.out.println();

        System.out.println("Mobile Phone 2:");
        phone2.displayDetails();
    }
}
