/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint =>
Take user input for 3 sides of a triangle
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
Author: Prakhar Khare
Date: 23-09-2026
 */

package javaMethods.level1;
import java.util.Scanner;
public class AthleteRounds {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceInMeters = 5 * 1000;
        return distanceInMeters / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the three sides
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Calculate number of rounds
        double numberOfRounds = calculateRounds(side1, side2, side3);

        // Display result
        System.out.println(
                "The number of rounds required to complete 5 km is "
                        + numberOfRounds
        );

        input.close();
    }
}
