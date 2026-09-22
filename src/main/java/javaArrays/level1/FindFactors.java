/*Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
Hint =>
Take the input for a number
Find the factors of the number and save them in an array. For this create integer variable maxFactor and initialize to 10, factors array of size maxFactor and index variable to reflect the index of the array.
To find factors loop through the numbers from 1 to the number, find the factors, and add them to the array element by incrementing the index. If the index is equal to maxIndex, then need factors array to store more elements
To store more elements, reset the maxIndex to twice its size, use the temp array to store the elements from the factors array, and eventually assign the factors array to the temp array
Finally, Display the factors of the number
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaArrays.level1;
import java.util.Scanner;
public class FindFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        int number = input.nextInt();

        // Initialize maximum factor array size
        int maxFactor = 10;

        // Create factors array
        int[] factors = new int[maxFactor];

        // Initialize index
        int index = 0;

        // Find factors from 1 to the number
        for (int i = 1; i <= number; i++) {

            // Check if i is a factor
            if (number % i == 0) {

                // Check if array needs more space
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;

                    // Create temporary array with increased size
                    int[] temp = new int[maxFactor];

                    // Copy existing factors into temporary array
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign temporary array to factors
                    factors = temp;
                }

                // Store factor in the array
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}
