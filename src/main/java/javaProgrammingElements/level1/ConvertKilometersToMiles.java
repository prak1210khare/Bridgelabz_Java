/*Create a program to convert the
 distance of 10.8 kilometers to miles.
 Hint: 1 km = 1.6 miles
Author: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level1;

public class ConvertKilometersToMiles {
    public static void main(String[] args) {

        // Fixed values
        double distanceInKilometers = 10.8;
        double milesPerKilometer = 1.6;

        // Calculate distance in miles
        double distanceInMiles = distanceInKilometers * milesPerKilometer;

        // Display result
        System.out.println(
                "The distance " + distanceInKilometers +
                        " km in miles is " + distanceInMiles
        );
    }
}
