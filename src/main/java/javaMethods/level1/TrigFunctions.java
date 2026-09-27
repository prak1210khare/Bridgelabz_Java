/*Write a program to calculate various trigonometric functions using Math class given an angle in degrees
 Hint =>
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
Author: Prakhar Khare
Date: 24-09-2026
 */

package javaMethods.level1;
import java.util.Scanner;
public class TrigFunctions {
    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get angle in degrees
        double angle = input.nextDouble();

        // Calculate trigonometric functions
        double[] result = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine = " + result[0]);
        System.out.println("Cosine = " + result[1]);
        System.out.println("Tangent = " + result[2]);

        input.close();
    }
}
