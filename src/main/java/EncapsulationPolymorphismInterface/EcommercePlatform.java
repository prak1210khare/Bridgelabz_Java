/*2. E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.
Author: Prakhar Khare
Date: 5-10-2026
 */
package EncapsulationPolymorphismInterface;
import java.util.ArrayList;
import java.util.List;

// Interface
interface Taxable {

    double calculateTax();

    String getTaxDetails();
}

// Abstract class
abstract class Product {

    // Private fields for encapsulation
    private int productId;
    private String name;
    private double price;

    // Constructor
    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter for productId
    public int getProductId() {
        return productId;
    }

    // Setter for productId
    public void setProductId(int productId) {
        this.productId = productId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    abstract double calculateDiscount();

    // Concrete method
    void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

// Electronics subclass
class Electronics extends Product implements Taxable {

    // Constructor
    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Calculate discount
    @Override
    double calculateDiscount() {
        return getPrice() * 10 / 100;
    }

    // Calculate tax
    @Override
    public double calculateTax() {
        return getPrice() * 18 / 100;
    }

    // Tax details
    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}

// Clothing subclass
class Clothing extends Product implements Taxable {

    // Constructor
    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Calculate discount
    @Override
    double calculateDiscount() {
        return getPrice() * 20 / 100;
    }

    // Calculate tax
    @Override
    public double calculateTax() {
        return getPrice() * 5 / 100;
    }

    // Tax details
    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}

// Groceries subclass
class Groceries extends Product {

    // Constructor
    Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Calculate discount
    @Override
    double calculateDiscount() {
        return getPrice() * 5 / 100;
    }
}

// Main class
public class EcommercePlatform {

    // Method to calculate and display final price
    static void calculateFinalPrice(List<Product> products) {

        for (Product product : products) {

            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = 0;

            // Check whether the product is taxable
            if (product instanceof Taxable) {

                Taxable taxableProduct = (Taxable) product;

                tax = taxableProduct.calculateTax();

                System.out.println(
                        taxableProduct.getTaxDetails()
                );
            } else {
                System.out.println("Tax: Not Applicable");
            }

            // Final price = Price + Tax - Discount
            double finalPrice = price + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Original Price: " + price);
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create products
        Electronics electronics =
                new Electronics(101, "Laptop", 50000);

        Clothing clothing =
                new Clothing(102, "Jacket", 5000);

        Groceries groceries =
                new Groceries(103, "Rice", 1000);

        // Create Product list
        List<Product> products = new ArrayList<>();

        products.add(electronics);
        products.add(clothing);
        products.add(groceries);

        // Calculate final price
        calculateFinalPrice(products);
    }
}
