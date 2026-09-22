/*Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
        Hint =>
        Create a fahrenheit variable and take the user's input
        User the formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
Author: Prakhar Khare
Date: 21-09-2026
 */

package javaProgrammingElements.level2;
import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take Celsius temperature as input
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double farenheitResult = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println(
                "The " + celsius + " celsius is " +
                        farenheitResult + " fahrenheit"
        );

        input.close();
    }
}
