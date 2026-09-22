/*Create a program to check if a number taken from the user is a Harshad Number.
Hint =>
A Harshad number is an integer which is divisible by the sum of its digits.
For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Create a while loop to access each digit of the number.
Inside the loop, add each digit of the number to sum.
Check if the number is perfectly divisible by the sum.
If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level3;
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take integer input
        int number = input.nextInt();

        // Store the original number
        int originalNumber = number;

        // Initialize sum to zero
        int sum = 0;

        // Use while loop to access each digit
        while (number != 0) {

            // Find the last digit
            int digit = number % 10;

            // Add the digit to sum
            sum = sum + digit;

            // Remove the last digit
            number = number / 10;
        }

        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        input.close();
    }

}
