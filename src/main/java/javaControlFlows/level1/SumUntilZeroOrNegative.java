/*Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
        Hint =>
        Use infinite while loop as in while (true)
        Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level1;
import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Initialize total
        double total = 0.0;

        // Infinite while loop
        while (true) {

            // Take user input
            double number = input.nextDouble();

            // Break the loop if number is 0 or negative
            if (number <= 0) {
                break;
            }

            // Add positive number to total
            total = total + number;
        }

        // Display the total
        System.out.println("The sum of the numbers is " + total);

        // Close Scanner
        input.close();
    }
}
