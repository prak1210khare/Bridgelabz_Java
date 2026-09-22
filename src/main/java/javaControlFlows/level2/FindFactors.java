/*Create a program to find the factors of a number taken as user input.
        Hint =>
        Get the input value for a variable named number.
        Run a for loop from i = 1 to i < number.
        In each iteration of the loop, check if number is perfectly divisible by i.
        If true, print the value of i.
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level2;
import java.util.Scanner;
public class FindFactors {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Find factors from 1 to number - 1
        for (int i = 1; i < number; i++) {

            // Check if number is perfectly divisible by i
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        // Close Scanner
        input.close();
    }
}
