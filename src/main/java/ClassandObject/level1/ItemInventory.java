/*Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.
Author: Prakhar Khare
Date: 1-10-2026
 */

package ClassandObject.level1;
class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemInventory {
    public static void main(String[] args) {

        // Create Item object
        Item item = new Item(101, "Laptop", 50000);

        // Quantity of items
        int quantity = 3;

        // Display item details
        item.displayDetails();

        // Calculate and display total cost
        double totalCost = item.calculateTotalCost(quantity);

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}