/*Sample Program 4: Shopping Cart System
Create a Product class to manage shopping cart items with the following features:
Static:
A static variable discount shared by all products.
A static method updateDiscount() to modify the discount percentage.
This:
Use this to initialize productName, price, and quantity in the constructor.
        Final:
Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
Validate whether an object is an instance of the Product class before processing its details.
Author: Prakhar Khare
Date: 1-10-2026
 */
package ThisStaticFinal;
class Product {

    // Static variable shared by all products
    static double discount = 10.0;

    // Instance variables
    String productName;
    double price;
    int quantity;

    // Final variable
    final int productID;

    // Constructor
    Product(String productName, double price, int quantity, int productID) {

        // 'this' refers to the current object's variables
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details
    void displayDetails() {
        double totalPrice = price * quantity;
        double discountAmount = totalPrice * discount / 100;
        double finalPrice = totalPrice - discountAmount;

        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + finalPrice);
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        // Create Product objects
        Product product1 =
                new Product("Laptop", 50000, 1, 101);

        Product product2 =
                new Product("Headphones", 3000, 2, 102);

        // Check if product1 is an instance of Product
        if (product1 instanceof Product) {
            System.out.println("Product 1 is valid.");
            product1.displayDetails();
        }

        System.out.println();

        // Check if product2 is an instance of Product
        if (product2 instanceof Product) {
            System.out.println("Product 2 is valid.");
            product2.displayDetails();
        }

        System.out.println();

        // Update discount for all products
        Product.updateDiscount(20);

        System.out.println("After Updating Discount:");

        if (product1 instanceof Product) {
            product1.displayDetails();
        }

        System.out.println();

        if (product2 instanceof Product) {
            product2.displayDetails();
        }
    }
}
