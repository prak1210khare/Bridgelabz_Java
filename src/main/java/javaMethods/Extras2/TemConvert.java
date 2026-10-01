/*Temperature Converter:
Write a program that converts temperatures between Fahrenheit and Celsius. ○
The program should have separate functions for converting from Fahrenheit to
Celsius and from Celsius to Fahrenheit.
Auhtor: Prakhar Khare
Date: 30-09-2026
 */
package javaMethods.Extras2;
import java.util.Scanner;

public class TemConvert {

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take temperature input
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();

        // Fahrenheit to Celsius
        double celsius = fahrenheitToCelsius(temperature);

        // Celsius to Fahrenheit
        double fahrenheit = celsiusToFahrenheit(temperature);

        // Display results
        System.out.println(
                temperature + " Fahrenheit = "
                        + celsius + " Celsius"
        );

        System.out.println(
                temperature + " Celsius = "
                        + fahrenheit + " Fahrenheit"
        );

        input.close();
    }
}