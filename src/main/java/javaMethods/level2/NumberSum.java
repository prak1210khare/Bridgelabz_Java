/*Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct.
        Hint =>
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2
Compare the two results and print the result
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level2;
import java.util.Scanner;
public class NumberSum {
    // Method to find sum using recursion
    public static int sumUsingRecursion(int number) {
        if (number == 1) {
            return 1;
        }

        return number + sumUsingRecursion(number - 1);
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input
        int number = input.nextInt();

        // Check whether the number is a natural number
        if (number <= 0) {
            System.out.println(
                    "The number " + number + " is not a natural number."
            );
            input.close();
            return;
        }

        // Calculate sum using recursion
        int recursiveSum = sumUsingRecursion(number);

        // Calculate sum using formula
        int formulaSum = sumUsingFormula(number);

        // Display results
        System.out.println("Sum using recursion = " + recursiveSum);
        System.out.println("Sum using formula = " + formulaSum);

        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("Both computations are not correct.");
        }

        input.close();
    }
}
