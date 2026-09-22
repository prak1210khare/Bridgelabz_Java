/*Rewrite program 14 using for loop
Hint =>
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result.
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level1;
import java.util.Scanner;
public class CalcFactorial {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take integer input
        int number = input.nextInt();

        // Check whether the number is a natural number
        if (number > 0) {

            // Initialize factorial
            long factorial = 1;

            // Calculate factorial using for loop
            for (int counter = 1; counter <= number; counter++) {
                factorial = factorial * counter;
            }

            // Display the factorial
            System.out.println(
                    "The factorial of " + number + " is " + factorial
            );

        } else {
            System.out.println(
                    "The number " + number + " is not a natural number."
            );
        }

        // Close Scanner
        input.close();
    }}

