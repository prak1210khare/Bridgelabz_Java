/*6. Online Food Delivery System
Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.
Author: Prakhar Khare
Date: 5-10-2026
 */

package EncapsulationPolymorphismInterface;
import java.util.ArrayList;
import java.util.List;

// Interface
interface Discountable {

    double applyDiscount();

    String getDiscountDetails();
}

// Abstract class
abstract class FoodItem {

    // Private fields for encapsulation
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract method
    abstract double calculateTotalPrice();

    // Concrete method
    void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

// VegItem subclass
class VegItem extends FoodItem implements Discountable {

    // Constructor
    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Calculate total price
    @Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Apply discount
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 10 / 100;
    }

    // Discount details
    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}

// NonVegItem subclass
class NonVegItem extends FoodItem implements Discountable {

    // Additional charge for non-veg items
    private double additionalCharge;

    // Constructor
    NonVegItem(String itemName, double price,
               int quantity, double additionalCharge) {

        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    // Calculate total price with additional charge
    @Override
    double calculateTotalPrice() {
        double itemTotal = getPrice() * getQuantity();
        return itemTotal + additionalCharge;
    }

    // Apply discount
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 5 / 100;
    }

    // Discount details
    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }

    // Getter
    public double getAdditionalCharge() {
        return additionalCharge;
    }

    // Setter
    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}

// Main class
public class OnlineFoodDeliverySystem {

    // Order processing method
    static void processOrder(List<FoodItem> foodItems) {

        double finalOrderAmount = 0;

        for (FoodItem foodItem : foodItems) {

            // Display item details
            foodItem.getItemDetails();

            // Calculate total price
            double totalPrice = foodItem.calculateTotalPrice();

            // Calculate discount
            double discount = 0;

            if (foodItem instanceof Discountable) {

                Discountable discountableItem =
                        (Discountable) foodItem;

                discount = discountableItem.applyDiscount();

                System.out.println(
                        discountableItem.getDiscountDetails()
                );
            }

            // Calculate final item price
            double finalPrice = totalPrice - discount;

            System.out.println("Total Price: " + totalPrice);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);

            finalOrderAmount += finalPrice;

            System.out.println();
        }

        // Display final order amount
        System.out.println(
                "Final Order Amount: " + finalOrderAmount
        );
    }

    public static void main(String[] args) {

        // Create VegItem
        VegItem vegItem = new VegItem(
                "Paneer Butter Masala",
                250,
                2
        );

        // Create NonVegItem
        NonVegItem nonVegItem = new NonVegItem(
                "Chicken Biryani",
                300,
                2,
                50
        );

        // Create food item list
        List<FoodItem> foodItems = new ArrayList<>();

        foodItems.add(vegItem);
        foodItems.add(nonVegItem);

        // Process complete order
        processOrder(foodItems);
    }
}