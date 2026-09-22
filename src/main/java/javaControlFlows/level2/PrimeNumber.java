/*Write a Program to check if the given number is a prime number or not
Hint =>
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number.
Use isPrime boolean variable to store the result
Author:Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level2;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Assume the number is prime
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        } else {

            // Check divisibility from 2 to the number - 1
            for (int counter = 2; counter < number; counter++) {

                // Check if the number is exactly divisible
                if (number % counter == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Close Scanner
        input.close();
    }
}
