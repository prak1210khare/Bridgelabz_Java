/*Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
        Hint =>
        Create a variable number1 and number 2 and take user inputs.
        Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
Auhtor: Prakhar Khare
Date: 21-09-2026
 */

package javaProgrammingElements.level1;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display result
        System.out.println(
                "The addition, subtraction, multiplication and division value of 2 numbers "
                        + number1 + " and " + number2 + " is "
                        + addition + ", "
                        + subtraction + ", "
                        + multiplication + ", and "
                        + division
        );

        input.close();
    }
}
