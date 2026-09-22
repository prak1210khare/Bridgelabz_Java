/*Write a program the find the distance in yards and miles for the distance provided by user in feets
        Hint => 1 mile = 1760 yards and 1 yard is 3 feet
Author: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level1;
import java.util.Scanner;
public class FeetToYardsMiles {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take distance in feet as input
        double distanceInFeet = input.nextDouble();

        // Conversion values
        double feetPerYard = 3;
        double yardsPerMile = 1760;

        // Convert feet to yards
        double distanceInYards = distanceInFeet / feetPerYard;

        // Convert yards to miles
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Display result
        System.out.println(
                "The distance in feet is " + distanceInFeet +
                        " feet, in yards is " + distanceInYards +
                        " yards, and in miles is " + distanceInMiles + " miles"
        );

        input.close();
    }
}
