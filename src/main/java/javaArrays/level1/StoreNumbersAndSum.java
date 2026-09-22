/*Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers
Hint =>
Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes to 0.0. Also, the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
Take another for loop to get the values of each element and add it to the total
Finally display the total value
Author: Prakhar Khare
Date: 22-09-2026
 */
package javaArrays.level1;
import java.util.Scanner;
public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array of maximum 10 double values
        double[] numbers = new double[10];

        // Initialize total and index
        double total = 0.0;
        int index = 0;

        // Take input until 0/negative number or array becomes full
        while (true) {
            double number = input.nextDouble();

            // Break if user enters 0 or a negative number
            if (number <= 0) {
                break;
            }

            // Break if array is full
            if (index == 10) {
                break;
            }

            // Store the number in the array
            numbers[index] = number;
            index++;
        }

        // Display all numbers and calculate their sum
        System.out.println("Numbers entered:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total = total + numbers[i];
        }

        // Display total
        System.out.println("Sum of all numbers = " + total);

        input.close();
    }
}
