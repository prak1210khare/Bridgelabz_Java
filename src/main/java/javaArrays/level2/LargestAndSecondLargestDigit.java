/*Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
Hint =>
Create a number variable and Take user input.
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaArrays.level2;
import java.util.Scanner;
public class LargestAndSecondLargestDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Create an array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Initialize index
        int index = 0;

        // Store digits in the array
        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Store the digit in the array
            digits[index] = digit;
            index++;

            // Remove the last digit
            number = number / 10;

            // Stop if array is full
            if (index == maxDigit) {
                break;
            }
        }

        // Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);

        input.close();
    }
}
