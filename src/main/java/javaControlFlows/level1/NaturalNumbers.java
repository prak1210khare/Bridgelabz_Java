/*Write a program to check for the natural number and write the sum of n natural numbers
Hint =>
A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
A sum of n natural numbers is n * (n+1) / 2
Author: Prakhar Khare
Date: 22-09-2026
*/
package javaControlFlows.level1;
import java.util.Scanner;
public class NaturalNumbers {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number > 0) {

            // Calculate sum of n natural numbers
            int sum = number * (number + 1) / 2;

            // Display result
            System.out.println(
                    "The sum of " + number + " natural numbers is " + sum
            );

        } else {

            // Display message for non-natural number
            System.out.println(
                    "The number " + number + " is not a natural number"
            );
        }

        // Close Scanner
        input.close();
    }
}
