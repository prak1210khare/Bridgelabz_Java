/*Write a Program to find the factorial of an integer entered by the user.
        Hint =>
        For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
        Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
        Using a while loop, compute the factorial.
        Print the factorial at the end.
Author: Prakhar Khare
Date: 22-09-2026
 */
package javaControlFlows.level1;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take integer input
        int number = input.nextInt();

        // Check whether the number is a positive integer
        if (number > 0) {

            // Initialize factorial and counter
            long factorial = 1;
            int counter = 1;

            // Calculate factorial using while loop
            while (counter <= number) {
                factorial = factorial * counter;
                counter++;
            }

            // Display the factorial
            System.out.println("The factorial of " + number + " is " + factorial);

        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close Scanner
        input.close();
    }
}
