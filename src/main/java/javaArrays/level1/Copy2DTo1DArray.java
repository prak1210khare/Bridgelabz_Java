/*Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint =>
Take user input for rows and columns, create a 2D array (Matrix), and take the user input
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaArrays.level1;
import java.util.Scanner;
public class Copy2DTo1DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take rows and columns as input
        int rows = input.nextInt();
        int columns = input.nextInt();

        // Create 2D array
        int[][] matrix = new int[rows][columns];

        // Take input for the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Create 1D array with size rows * columns
        int[] array = new int[rows * columns];

        // Initialize index for 1D array
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display the 1D array
        System.out.println("1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}
