/*Write a program to find the sum of numbers until the user enters 0
Hint =>
Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
Use the while loop to check if the user entered is 0
If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
The loop will continue till the user enters zero and outside the loop display the total value
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level1;
import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Initialize total and user input
        double total = 0.0;
        double number = input.nextDouble();

        // Continue until the user enters 0
        while (number != 0) {

            // Add the entered number to total
            total = total + number;

            // Ask for the next number
            number = input.nextDouble();
        }

        // Display the total
        System.out.println("The sum of the numbers is " + total);

        // Close Scanner
        input.close();
    }
}
