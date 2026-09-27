/*Write a program to take 2 numbers and print their quotient and reminder
Hint =>
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number
public static int[] findRemainderAndQuotient(int number, int divisor)
Author: Prakhar Khare
Date: 24-09-2026
 */

package javaMethods.level1;
import java.util.Scanner;
public class QuotientAndRemainder {
    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for number and divisor
        int number = input.nextInt();
        int divisor = input.nextInt();

        // Find quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display result
        System.out.println("Quotient = " + result[1]);
        System.out.println("Remainder = " + result[0]);

        input.close();
    }
}
