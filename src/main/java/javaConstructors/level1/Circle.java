/*Write a Circle class with a radius attribute. Use constructor chaining
to initialize radius with default and user-provided values.
Author: Prakhar Khare
Date: 1-10-2026
 */
package javaConstructors.level1;

public class Circle {

    // Attribute
    double radius;

    // Default constructor
    Circle() {
        this(1.0);
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {

        // Object using default constructor
        Circle circle1 = new Circle();

        // Object using parameterized constructor
        Circle circle2 = new Circle(5.0);

        System.out.println("Circle 1:");
        circle1.displayRadius();

        System.out.println();

        System.out.println("Circle 2:");
        circle2.displayRadius();
    }
}
