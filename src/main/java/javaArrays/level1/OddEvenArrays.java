/*Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint =>
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaArrays.level1;
import java.util.Scanner;
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
            input.close();
            return;
        }

        // Create arrays to store odd and even numbers
        int size = number / 2 + 1;
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];

        // Initialize indexes
        int oddIndex = 0;
        int evenIndex = 0;

        // Store odd and even numbers in their respective arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Display odd numbers
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Display even numbers
        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        input.close();
    }
}
