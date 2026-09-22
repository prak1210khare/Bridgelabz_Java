/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters
        Hint => Area of a Triangle is ½ * base * height
Author: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level1;
import java.util.Scanner;
public class CalculateTriangleArea {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take base and height in inches
        double baseInInches = input.nextDouble();
        double heightInInches = input.nextDouble();

        // Conversion value
        double centimetersPerInch = 2.54;

        // Calculate area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        // Convert base and height to centimeters
        double baseInCm = baseInInches * centimetersPerInch;
        double heightInCm = heightInInches * centimetersPerInch;

        // Calculate area in square centimeters
        double areaInSquareCentimeters = 0.5 * baseInCm * heightInCm;

        // Display result
        System.out.println(
                "The area of triangle in square inches is " + areaInSquareInches +
                        " and in square centimeters is " + areaInSquareCentimeters
        );

        input.close();
    }
}
