/*Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint =>
Create a String Array to save the results and
Finally, loop again to show the results of the array based on the index position
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaArrays.level1;
import java.util.Scanner;
public class FizzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        int number = input.nextInt();

        // Check if the number is a positive integer
        if (number > 0) {

            // Create a String array to store FizzBuzz results
            String[] results = new String[number + 1];

            // Store FizzBuzz results in the array
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }

            // Display the results with position
            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + (i + 1) + " = " + results[i]);
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
