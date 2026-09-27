/*Write a program to find the frequency of characters in a string using unique characters and display the result
Hint =>
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies.
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.
Author: Prakhar Khare
Date: 28-09-2026
 */
package javaStrings.level3;
import java.util.Scanner;
public class CharFreq1 {
    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {

        int textLength = text.length();

        // Temporary array with size equal to text length
        char[] uniqueCharacters = new char[textLength];

        int uniqueCount = 0;

        // Check each character
        for (int i = 0; i < textLength; i++) {

            char currentCharacter = text.charAt(i);

            boolean isUnique = true;

            // Check previous characters
            for (int j = 0; j < i; j++) {

                if (text.charAt(j) == currentCharacter) {
                    isUnique = false;
                    break;
                }
            }

            // Store character if it is unique
            if (isUnique) {
                uniqueCharacters[uniqueCount] = currentCharacter;
                uniqueCount++;
            }
        }

        // Create final array containing only unique characters
        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueCharacters[i];
        }

        return result;
    }

    // Method to find frequency of unique characters
    public static String[][] findCharacterFrequency(String text) {

        // Create frequency array for 256 ASCII characters
        int[] frequency = new int[256];

        // Find frequency of every character
        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            frequency[character]++;
        }

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Create 2D array for character and frequency
        String[][] result = new String[uniqueCharacters.length][2];

        // Store unique characters and their frequencies
        for (int i = 0; i < uniqueCharacters.length; i++) {

            char character = uniqueCharacters[i];

            result[i][0] = String.valueOf(character);
            result[i][1] = String.valueOf(frequency[character]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take string input
        String text = input.nextLine();

        // Find character frequencies
        String[][] result = findCharacterFrequency(text);

        // Display result
        System.out.println("Character\tFrequency");
        System.out.println("-------------------------");

        for (int i = 0; i < result.length; i++) {

            System.out.println(
                    result[i][0] + "\t\t" + result[i][1]
            );
        }

        input.close();
    }
}
