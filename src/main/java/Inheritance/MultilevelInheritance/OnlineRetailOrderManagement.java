/*Multilevel Inheritance
Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
        Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Author: Prakhar Khare
Date: 4-10-2026
 */
package Inheritance.MultilevelInheritance;
// Base class
class Order {

    // Order attributes
    int orderId;
    String orderDate;

    // Constructor
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    String getOrderStatus() {
        return "Order Placed";
    }

    // Method to display order details
    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + getOrderStatus());
    }
}

// First level subclass
class ShippedOrder extends Order {

    // Shipped order attribute
    String trackingNumber;

    // Constructor
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus()
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }

    // Display shipped order details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Second level subclass
class DeliveredOrder extends ShippedOrder {

    // Delivered order attribute
    String deliveryDate;

    // Constructor
    DeliveredOrder(int orderId, String orderDate,
                   String trackingNumber, String deliveryDate) {

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus()
    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }

    // Display delivered order details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class
public class OnlineRetailOrderManagement {

    public static void main(String[] args) {

        // Create DeliveredOrder object
        DeliveredOrder order = new DeliveredOrder(
                1001,
                "01-10-2026",
                "TRK123456",
                "04-10-2026"
        );

        // Display order details
        order.displayDetails();
    }
}