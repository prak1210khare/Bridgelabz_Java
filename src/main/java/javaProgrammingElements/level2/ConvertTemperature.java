/*Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
        Hint =>
        Create a celsius variable and take the temperature as user input
        Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to farenheitResult  and print the result
Auhtor: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level2;
import java.util.Scanner;
public class ConvertTemperature {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take Fahrenheit temperature as input
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display result
        System.out.println(
                "The " + fahrenheit + " fahrenheit is " +
                        celsiusResult + " celsius"
        );

        input.close();
    }
}
