/*Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint =>
        Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae
root1 of x = (-b + delta)/(2*a)
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x
root of x = -b/(2*a)
If delta is negative return empty array or nothing
Write a Method to find find the roots of a quadratic equation and return the roots
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level2;
import java.util.Scanner;
public class Quadratic {
    // Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // Calculate discriminant
        double delta = Math.pow(b, 2) - (4 * a * c);

        // If delta is negative, there are no real roots
        if (delta < 0) {
            return new double[0];
        }

        // If delta is zero, there is one root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // If delta is positive, there are two roots
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for a, b, and c
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Find roots
        double[] roots = findRoots(a, b, c);

        // Display roots
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The root is " + roots[0]);
        } else {
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        }

        input.close();
    }
}
