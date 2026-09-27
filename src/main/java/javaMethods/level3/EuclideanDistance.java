/*Write a program Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()
Hint =>
Take inputs for 2 points x1, y1, and x2, y2
Method to find the Euclidean distance between two points and return the distance
distance = (x2-x1)2 +(y2-y1)2
Write a Method to find the equation of a line given two points and return the equation which includes the slope and the y-intercept
The equation of a line is given by the equation y = m*x + b Where m is the slope and b is the y-intercept. So firstly compute the slope using the formulae
m = (y2 - y1)/(x2 - x1)
Post that compute the y-intercept b using the formulae
        b = y1 - m*x1
Finally, return an array having slope m and y-intercept b
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level3;
import java.util.Scanner;
public class EuclideanDistance {
    // Method to find the Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );

        return distance;
    }

    // Method to find the slope and y-intercept of the line
    public static double[] findLineEquation(
            double x1, double y1, double x2, double y2) {

        double slope = (y2 - y1) / (x2 - x1);

        double yIntercept = y1 - slope * x1;

        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for first point
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        // Take input for second point
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Find Euclidean distance
        double distance = findDistance(x1, y1, x2, y2);

        // Find slope and y-intercept
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);

        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        // Display results
        System.out.println("Euclidean Distance = " + distance);
        System.out.println("Slope = " + slope);
        System.out.println("Y-Intercept = " + yIntercept);
        System.out.println("Equation of Line = y = " + slope + "x + " + yIntercept);

        input.close();
    }
}
