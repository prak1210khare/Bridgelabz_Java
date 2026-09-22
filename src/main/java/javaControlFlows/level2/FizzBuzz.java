/*Write a program FizzBuzz, take a number as user input, and if it is a positive integer loop from 0 to the number and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
Hint =>
Write the program and use for loop
Author: Prakhar Khare
Date: 22-09-2026
*/

package javaControlFlows.level2;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Check if the number is a positive integer
        if (number > 0) {

            // Loop from 0 to the given number
            for (int counter = 0; counter <= number; counter++) {

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
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close Scanner
        input.close();
    }
}
