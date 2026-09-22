/*Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers.
        Hint =>
        Take the user input number and check whether it's a Natural number
        If it's a natural number Compute using formulae as well as compute using for loop
        Compare the two results and print the result
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level1;
import java.util.Scanner;
public class CompareSum {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        int number = input.nextInt();

        // Check whether the number is a natural number
        if (number > 0) {

            // Calculate sum using for loop
            int sumUsingFor = 0;

            for (int counter = 1; counter <= number; counter++) {
                sumUsingFor = sumUsingFor + counter;
            }

            // Calculate sum using formula
            int sumUsingFormula = number * (number + 1) / 2;

            // Display both results
            System.out.println("Sum using for loop = " + sumUsingFor);
            System.out.println("Sum using formula = " + sumUsingFormula);

            // Compare both results
            if (sumUsingFor == sumUsingFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Both computations are not correct.");
            }

        } else {
            System.out.println(
                    "The number " + number + " is not a natural number."
            );
        }

        // Close Scanner
        input.close();
    }
}
