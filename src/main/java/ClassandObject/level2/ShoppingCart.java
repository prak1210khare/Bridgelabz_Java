/*Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost.
Author: Prakhar Khare
Date: 1-10-2026
 */
package ClassandObject.level2;
class CartItem {
    // Attributes
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add items to the cart
    void addItem(int quantity) {
        this.quantity = this.quantity + quantity;
        System.out.println(quantity + " item(s) added to the cart.");
    }

    // Method to remove items from the cart
    void removeItem(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity = this.quantity - quantity;
            System.out.println(quantity + " item(s) removed from the cart.");
        } else {
            System.out.println("Cannot remove more items than available.");
        }
    }

    // Method to display the total cost
    void displayTotalCost() {
        double totalCost = price * quantity;

        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        // Create CartItem object
        CartItem item = new CartItem("Laptop", 50000, 1);

        // Add items
        item.addItem(2);

        // Remove an item
        item.removeItem(1);

        // Display total cost
        item.displayTotalCost();
    }
}