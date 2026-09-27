/*Write a program calculate the wind chill temperature given the temperature and wind speed
Hint =>
Write a method to calculate the wind chill temperature using the formula
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16
public double calculateWindChill(double temperature, double windSpeed)
Author: Prakhar Khare
Date: 24-09-2026
 */

package javaMethods.level1;
import java.util.Scanner;
public class WindChill {
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74
                + (0.6215 * temperature)
                + ((0.4275 * temperature - 35.75)
                * Math.pow(windSpeed, 0.16));

        return windChill;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get temperature and wind speed
        double temperature = input.nextDouble();
        double windSpeed = input.nextDouble();

        // Calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display result
        System.out.println("The Wind Chill Temperature is " + windChill);

        input.close();
    }
}
