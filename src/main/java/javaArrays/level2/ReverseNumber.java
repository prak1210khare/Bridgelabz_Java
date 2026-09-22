/*Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint =>
Take user input for a number.
Find the count of digits in the number.
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaArrays.level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Find the count of digits
        int tempNumber = number;
        int digitCount = 0;

        while (tempNumber != 0) {
            digitCount++;
            tempNumber = tempNumber / 10;
        }

        // Create an array to store the digits
        int[] digits = new int[digitCount];

        // Store the digits in the array
        tempNumber = number;

        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }

        // Create an array to store digits in reverse order
        int[] reverseDigits = new int[digitCount];

        // Copy digits into reverse array
        for (int i = 0; i < digitCount; i++) {
            reverseDigits[i] = digits[digitCount - 1 - i];
        }

        // Display the reversed number
        System.out.print("The reverse of " + number + " is ");

        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }

        input.close();
    }
}