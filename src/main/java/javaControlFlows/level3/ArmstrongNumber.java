/*Create a program to check if a number is Armstrong or not. Use the hints to show the steps clearly in the code
        Hint =>
        Armstrong Number is a number whose Sum of cubes of each digit results in the original number e.g. 153 = 1^3 + 5^3 + 3^3
        Get an integer input and store it in the number variable define sum variable, initialize it to zero and originalNumber variable, and assign it to the input number variable
        Use the while loop till the originalNumber is not equal to zero
        In the while loop find the reminder number by using the modulus operator as in  number % 10. Find the cube of the number and add it to the sum variable
        Again in while loop find the quotient of the number and assign it to the original number using number / 10 expression. This romoves the last digit of the original number.
        Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly
Author: Prakhar Khare
Date: 22-09-2026
 */
package javaControlFlows.level3;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take integer input
        int number = input.nextInt();

        // Store the original number
        int originalNumber = number;

        // Initialize sum to zero
        int sum = 0;

        // Use while loop until originalNumber becomes zero
        while (originalNumber != 0) {

            // Find the last digit
            int digit = originalNumber % 10;

            // Find the cube of the digit
            int cube = digit * digit * digit;

            // Add the cube to sum
            sum = sum + cube;

            // Remove the last digit
            originalNumber = originalNumber / 10;
        }

        // Check if sum is equal to the original number
        if (number == sum) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        input.close();
    }
}
