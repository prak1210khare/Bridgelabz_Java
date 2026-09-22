/*Rewrite the program 5 FizzBuzz using while loop
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level2;
import java.util.Scanner;
public class FizzBuzz1 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Check if the number is a positive integer
        if (number > 0) {

            // Initialize counter
            int counter = 0;

            // Loop from 0 to the given number
            while (counter <= number) {

                // Check for multiples of both 3 and 5
                if (counter % 3 == 0 && counter % 5 == 0) {
                    System.out.println("FizzBuzz");

                    // Check for multiples of 3
                } else if (counter % 3 == 0) {
                    System.out.println("Fizz");

                    // Check for multiples of 5
                } else if (counter % 5 == 0) {
                    System.out.println("Buzz");

                    // Print the number
                } else {
                    System.out.println(counter);
                }

                // Increment counter
                counter++;
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close Scanner
        input.close();
    }
}
