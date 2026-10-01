/*GCD and LCM Calculator:
Create a program that calculates the Greatest Common Divisor (GCD) and Least
Common Multiple (LCM) of two numbers using functions.
Use separate functions for GCD and LCM calculations, showcasing how modular
code works.
Author: Prakhar Khare
Date: 30-09-2026
 */
package javaMethods.Extras2;
import java.util.Scanner;

public class GCDAndLCM {

    // Method to take input
    public static int[] getInput(Scanner input) {

        int[] numbers = new int[2];

        System.out.print("Enter two numbers: ");

        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();

        return numbers;
    }

    // Method to calculate GCD
    public static int calculateGCD(int number1, int number2) {

        while (number2 != 0) {

            int remainder = number1 % number2;

            number1 = number2;
            number2 = remainder;
        }

        return number1;
    }

    // Method to calculate LCM
    public static int calculateLCM(int number1, int number2) {

        int gcd = calculateGCD(number1, number2);

        return Math.abs(number1 * number2) / gcd;
    }

    // Method to display the result
    public static void displayResult(
            int number1, int number2, int gcd, int lcm) {

        System.out.println("GCD of " + number1 + " and "
                + number2 + " = " + gcd);

        System.out.println("LCM of " + number1 + " and "
                + number2 + " = " + lcm);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input
        int[] numbers = getInput(input);

        int number1 = numbers[0];
        int number2 = numbers[1];

        // Calculate GCD
        int gcd = calculateGCD(number1, number2);

        // Calculate LCM
        int lcm = calculateLCM(number1, number2);

        // Display result
        displayResult(number1, number2, gcd, lcm);

        input.close();
    }
}
