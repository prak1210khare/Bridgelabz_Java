/*Problem 1: Product Inventory
Create a Product class with:
Instance Variables: productName, price.
Class Variable: totalProducts (shared among all products).
Methods:
An instance method displayProductDetails() to display the details of a product.
A class method displayTotalProducts() to show the total number of products created.
Author: Prakhar Khare
Date: 1-10-2026
 */
package javaStatic.level1;

class Product {

    // Instance variables
    String productName;
    double price;

    // Class variable
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {

        // Create Product objects
        Product product1 = new Product("Laptop", 50000);
        Product product2 = new Product("Mouse", 1000);
        Product product3 = new Product("Keyboard", 2000);

        // Display product details
        System.out.println("Product 1:");
        product1.displayProductDetails();

        System.out.println();

        System.out.println("Product 2:");
        product2.displayProductDetails();

        System.out.println();

        System.out.println("Product 3:");
        product3.displayProductDetails();

        System.out.println();

        // Display total number of products
        Product.displayTotalProducts();
    }
}
