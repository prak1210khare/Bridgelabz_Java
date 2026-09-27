/*Write a program to to check if a text is palindrome and display the result
Hint =>
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the string to determine whether the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
First, check if the start index is greater than or equal to the end index, then return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index incremented by 1 and the end index
Auhtor: Prakhar Khare
Date: 28-09-2026
 */

package javaStrings.level3;

import java.util.Scanner;

public class Palindrome {

    // Logic 1: Check palindrome using loop
    public static boolean checkPalindromeUsingLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            // Compare characters from start and end
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            // Move towards the middle
            start++;
            end--;
        }

        return true;
    }

    // Logic 2: Check palindrome using recursion
    public static boolean checkPalindromeUsingRecursion(
            String text, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Compare characters from start and end
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkPalindromeUsingRecursion(
                text, start + 1, end - 1
        );
    }

    // Logic 3: Reverse string using charAt()
    public static char[] reverseString(String text) {

        char[] reverseArray = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reverseArray[i] = text.charAt(text.length() - 1 - i);
        }

        return reverseArray;
    }

    // Compare original and reverse character arrays
    public static boolean checkPalindromeUsingArrays(
            String text, char[] reverseArray) {

        char[] originalArray = text.toCharArray();

        for (int i = 0; i < originalArray.length; i++) {

            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take text input
        String text = input.nextLine();

        // Logic 1: Using loop
        boolean loopResult =
                checkPalindromeUsingLoop(text);

        // Logic 2: Using recursion
        boolean recursiveResult =
                checkPalindromeUsingRecursion(
                        text, 0, text.length() - 1
                );

        // Logic 3: Using character arrays
        char[] reverseArray = reverseString(text);
        boolean arrayResult =
                checkPalindromeUsingArrays(text, reverseArray);

        // Display results
        System.out.println(
                "Palindrome using loop = " + loopResult
        );

        System.out.println(
                "Palindrome using recursion = " + recursiveResult
        );

        System.out.println(
                "Palindrome using character arrays = " + arrayResult
        );

        input.close();
    }
}