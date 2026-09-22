/*Create a program to print odd and even numbers between 1 to the number entered by the user.
        Hint =>
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level1;
import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Check whether the number is a natural number
        if (number > 0) {

            // Iterate from 1 to the given number
            for (int counter = 1; counter <= number; counter++) {

                // Check whether the number is even or odd
                if (counter % 2 == 0) {
                    System.out.println(counter + " is an even number.");
                } else {
                    System.out.println(counter + " is an odd number.");
                }
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
