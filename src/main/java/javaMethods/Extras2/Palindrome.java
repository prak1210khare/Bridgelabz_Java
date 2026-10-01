/*Palindrome Checker:
○ Write a program that checks if a given string is a palindrome (a word, phrase, or
  sequence that reads the same backward as forward).
○ Break the program into functions for input, checking the palindrome condition,
and displaying the result.
Author: Prakhar Khare
Date: 30-09-2026
 */

package javaMethods.Extras2;

import java.util.Scanner;

public class Palindrome {

    // Method to take input
    public static String getInput(Scanner input) {

        System.out.print("Enter a string: ");
        return input.nextLine();
    }

    // Method to check whether the string is a palindrome
    public static boolean checkPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            // Compare characters from both ends
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method to display the result
    public static void displayResult(String text, boolean result) {

        if (result) {
            System.out.println(
                    "\"" + text + "\" is a palindrome."
            );
        } else {
            System.out.println(
                    "\"" + text + "\" is not a palindrome."
            );
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input
        String text = getInput(input);

        // Check palindrome
        boolean result = checkPalindrome(text);

        // Display result
        displayResult(text, result);

        input.close();
    }
}
