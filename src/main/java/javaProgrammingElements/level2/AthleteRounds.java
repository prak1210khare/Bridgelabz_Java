/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
        Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Author: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level2;
import java.util.Scanner;
public class AthleteRounds {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take side inputs in meters
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Calculate perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Convert 5 km into meters
        double totalDistance = 5 * 1000;

        // Calculate number of rounds
        double numberOfRounds = totalDistance / perimeter;

        // Display result
        System.out.println(
                "The total number of rounds the athlete will run is "
                        + numberOfRounds
                        + " to complete 5 km"
        );

        // Close Scanner
        input.close();
    }
}
