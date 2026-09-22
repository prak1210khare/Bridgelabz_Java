/*Write a program to take 2 numbers and print their quotient and reminder
        Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
Auhtor: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level2;
import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display result
        System.out.println(
                "The Quotient is " + quotient +
                        " and Reminder is " + remainder +
                        " of two number " + number1 + " and " + number2
        );

        input.close();
    }
}
