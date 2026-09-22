/*Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct.
        Hint =>
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result
Author: Prakhar Khare
Date: 22-09-2026
*/

package javaControlFlows.level1;
import java.util.Scanner;
public class NaturalNumberSum {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        int number = input.nextInt();

        // Check whether the number is a natural number
        if (number > 0) {

            // Calculate sum using while loop
            int sumUsingWhile = 0;
            int counter = 1;

            while (counter <= number) {
                sumUsingWhile = sumUsingWhile + counter;
                counter++;
            }

            // Calculate sum using formula
            int sumUsingFormula = number * (number + 1) / 2;

            // Display both results
            System.out.println("Sum using while loop = " + sumUsingWhile);
            System.out.println("Sum using formula = " + sumUsingFormula);

            // Compare both results
            if (sumUsingWhile == sumUsingFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Both computations are not correct.");
            }

        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close Scanner
        input.close();
    }
}
