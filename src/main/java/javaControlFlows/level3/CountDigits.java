/*Create a program to count the number of digits in an integer.
Hint =>
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level3;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take integer input
        int number = input.nextInt();

        // Initialize count to zero
        int count = 0;

        // Loop until number becomes zero
        while (number != 0) {

            // Remove the last digit
            number = number / 10;

            // Increase count by 1
            count++;
        }

        // Display the number of digits
        System.out.println("Number of digits = " + count);

        input.close();
    }
}
