/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed.
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level3;
import java.util.Scanner;
public class CheckingOfNumber {
    // Method to find the count of digits
    public static int countDigits(int number) {
        int count = 0;

        if (number == 0) {
            return 1;
        }

        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];

        int index = digitCount - 1;

        if (number == 0) {
            digits[0] = 0;
            return digits;
        }

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index--;
        }

        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    // Method to check whether the number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);

        return compareArrays(digits, reversed);
    }

    // Method to check whether the number is a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Count digits
        int digitCount = countDigits(number);

        // Store digits
        int[] digits = storeDigits(number);

        // Reverse digits
        int[] reversedDigits = reverseDigits(digits);

        // Check palindrome
        boolean palindrome = isPalindrome(digits);

        // Check Duck Number
        boolean duckNumber = isDuckNumber(digits);

        // Display results
        System.out.println("Number of digits = " + digitCount);

        System.out.print("Digits = ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.print("Reversed digits = ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Is Palindrome? " + palindrome);
        System.out.println("Is Duck Number? " + duckNumber);

        input.close();
    }
}
