/*Write a program to find the first non-repeating character in a string and show the result
Hint =>
Non-repeating character is a character that occurs only once in the string
Create a Method to find the first non-repeating character in a string using the charAt() method and return the character. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Loop through the text to find the first non-repeating character in the text by checking the frequency of each character
In the main function take user inputs, call user-defined methods, and displays result.
Author: Prakhar Khare
Date: 28-09-2026
 */
package javaStrings.level3;
import java.util.Scanner;
public class NonRepeating {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(String text) {

        // Array to store frequency of ASCII characters
        int[] frequency = new int[256];

        // Find frequency of each character
        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            frequency[character]++;
        }

        // Find the first character whose frequency is 1
        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            if (frequency[character] == 1) {
                return character;
            }
        }

        // Return '\0' if no non-repeating character exists
        return '\0';
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take string input
        String text = input.nextLine();

        // Find first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);

        // Display result
        if (result == '\0') {
            System.out.println("There is no non-repeating character.");
        } else {
            System.out.println(
                    "The first non-repeating character is: " + result
            );
        }

        input.close();
    }
}
