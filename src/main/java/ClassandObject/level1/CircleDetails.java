/*Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle.
Author: Prakhar Khare
Date: 1-10-2026
 */

package ClassandObject.level1;
class Circle {
    // Attribute
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display results
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleDetails {
    public static void main(String[] args) {

        // Create Circle object
        Circle circle = new Circle(5);

        // Display area and circumference
        circle.displayDetails();
    }
}