/*Factorial Using Recursion:
○ Write a program that calculates the factorial of a number using a recursive
function.
○ Include modular code to separate input, calculation, and output processes.
Author: Prakhar Khare
Date: 30-09-2026
 */
package javaMethods.Extras2;
import java.util.Scanner;

public class Factorial {

    // Method to take input
    public static int getInput(Scanner input) {

        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    // Method to calculate factorial using recursion
    public static long calculateFactorial(int number) {

        // Base condition
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive call
        return number * calculateFactorial(number - 1);
    }

    // Method to display the result
    public static void displayResult(int number, long factorial) {

        System.out.println(
                "The factorial of " + number + " is " + factorial
        );
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input
        int number = getInput(input);

        // Check for negative number
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {

            // Calculate factorial
            long factorial = calculateFactorial(number);

            // Display result
            displayResult(number, factorial);
        }

        input.close();
    }
}