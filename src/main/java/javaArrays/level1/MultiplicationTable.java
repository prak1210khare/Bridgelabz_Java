/*Create a program to print a multiplication table of a number.
        Hint =>
        Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
        Run a loop from 1 to 10 and store the results in the multiplication table array
        Finally, display the result from the array in the format number * i = ___
Author: Prakhar Khare
Date: 22-09-2026
 */
package javaArrays.level1;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take integer input
        int number = input.nextInt();

        // Create an array to store multiplication results
        int[] multiplicationResult = new int[4];

        // Calculate multiplication results from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.println(
                    number + " * " + i + " = " + multiplicationResult[i - 6]
            );
        }

        input.close();
    }
}