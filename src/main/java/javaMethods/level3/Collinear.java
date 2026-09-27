/*Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling.
        Hint =>
Take inputs for 3 points x1, y1, x2, y2, and x3, y3
Write a Method to find the 3 points that are collinear using the slope formula. The 3 points A(x1,y1), b(x2,y2), and c(x3,y3) are collinear if the slopes formed by 3 points ab, bc, and cd are equal.
        slope AB = (y2 - y1)/(x2 - x1), slope BC = (y3 - y2)/(x3 - x3)
slope AC = (y3 - y1)/(x3 - x1) Points are collinear if
slope AB = slope BC = slope Ac
The method to find the three points is collinear using the area of the triangle formula. The Three points are collinear if the area of the triangle formed by three points is 0. The area of a triangle is
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level3;
import java.util.Scanner;
public class Collinear {
    // Method to check collinearity using slope
    public static boolean checkUsingSlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle
    public static boolean checkUsingArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = 0.5 * Math.abs(
                x1 * (y2 - y3)
                        + x2 * (y3 - y1)
                        + x3 * (y1 - y2)
        );

        return area == 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for Point A
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        // Take input for Point B
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Take input for Point C
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Check using slope
        boolean slopeResult = checkUsingSlope(
                x1, y1, x2, y2, x3, y3
        );

        // Check using area
        boolean areaResult = checkUsingArea(
                x1, y1, x2, y2, x3, y3
        );

        // Display results
        System.out.println("Using Slope Formula:");
        if (slopeResult) {
            System.out.println("The three points are Collinear.");
        } else {
            System.out.println("The three points are not Collinear.");
        }

        System.out.println("Using Area of Triangle Formula:");
        if (areaResult) {
            System.out.println("The three points are Collinear.");
        } else {
            System.out.println("The three points are not Collinear.");
        }

        input.close();
    }

}
