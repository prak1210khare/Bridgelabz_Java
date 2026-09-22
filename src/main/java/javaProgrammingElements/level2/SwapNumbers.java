/*Create a program to swap two numbers
        Hint =>
        Create a variable number1 and take user input.
        Create a variable number2 and take user input.
        Swap number1 and number2  and print the swapped output
Author: Prakhar Khare
Date:21-09-2026
 */
package javaProgrammingElements.level2;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Swap the numbers using a temporary variable
        int temporary = number1;
        number1 = number2;
        number2 = temporary;

        // Display swapped result
        System.out.println(
                "The swapped numbers are " + number1 +
                        " and " + number2
        );

        input.close();
    }

}
