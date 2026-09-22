/*Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
Author: Prakhar Khare
Date: 21-09-2026
 */

package javaProgrammingElements.level1;

public class CalculateEarthVolume {
    public static void main(String[] args) {

        // Fixed values
        double radiusInKm = 6378;
        double kilometersToMiles = 0.621371;
        double pi = Math.PI;

        // Convert radius from kilometers to miles
        double radiusInMiles = radiusInKm * kilometersToMiles;

        // Calculate volume in cubic kilometers and cubic miles
        double volumeInCubicKm = (4.0 / 3.0) * pi * Math.pow(radiusInKm, 3);
        double volumeInCubicMiles = (4.0 / 3.0) * pi * Math.pow(radiusInMiles, 3);

        // Display result
        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeInCubicKm +
                        " and cubic miles is " + volumeInCubicMiles
        );
    }
}
