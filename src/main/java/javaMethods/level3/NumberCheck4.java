/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.
Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself
Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7
Author: Prakhar Khare
Date: 25-09-2026
 */
package javaMethods.level3;
import java.util.Scanner;
public class NumberCheck4 {
    // Method to check if a number is a Prime Number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to check if a number is a Neon Number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;

        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        return sum == number;
    }

    // Method to check if a number is a Spy Number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;

        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }

        return sum == product;
    }

    // Method to check if a number is an Automorphic Number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (square % 10 != temp % 10) {
                return false;
            }

            square = square / 10;
            temp = temp / 10;
        }

        return true;
    }

    // Method to check if a number is a Buzz Number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Call different methods
        boolean prime = isPrime(number);
        boolean neon = isNeonNumber(number);
        boolean spy = isSpyNumber(number);
        boolean automorphic = isAutomorphicNumber(number);
        boolean buzz = isBuzzNumber(number);

        // Display results
        System.out.println("Is Prime Number? " + prime);
        System.out.println("Is Neon Number? " + neon);
        System.out.println("Is Spy Number? " + spy);
        System.out.println("Is Automorphic Number? " + automorphic);
        System.out.println("Is Buzz Number? " + buzz);

        input.close();
    }
}
