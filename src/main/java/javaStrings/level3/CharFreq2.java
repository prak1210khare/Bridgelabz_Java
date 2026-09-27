/*Write a program to find the frequency of characters in a string using nested loops and display the result
Hint =>
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. The logic used here is as follows:
Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
Loops to Find the frequency of each character in the text and store the result in a frequency array. For this use a Nested Loop with an Outer loop to iterate through each character in the text and initialize the frequency of each character to 1. And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to avoid counting them again.
Create a 1D String array to store the characters and their frequencies. For this Iterate through the characters in the text and store the characters and their frequencies
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
Author: Prakhar Khare
Date: 28-09-2026
 */

package javaStrings.level3;
import java.util.Scanner;
public class CharFreq2 {
    // Method to find frequency of characters using nested loops
    public static String[] findCharacterFrequency(String text) {

        // Convert string into character array
        char[] characters = text.toCharArray();

        // Array to store frequency of each character
        int[] frequency = new int[characters.length];

        // Outer loop
        for (int i = 0; i < characters.length; i++) {

            // Skip duplicate characters
            if (characters[i] == '0') {
                continue;
            }

            // Initialize frequency as 1
            frequency[i] = 1;

            // Inner loop to find duplicates
            for (int j = i + 1; j < characters.length; j++) {

                if (characters[i] == characters[j]) {

                    // Increase frequency
                    frequency[i]++;

                    // Mark duplicate character as 0
                    characters[j] = '0';
                }
            }
        }

        // Count unique characters
        int uniqueCount = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // Create String array to store character and frequency
        String[] result = new String[uniqueCount * 2];

        int index = 0;

        // Store characters and frequencies
        for (int i = 0; i < characters.length; i++) {

            if (characters[i] != '0') {

                result[index] = String.valueOf(characters[i]);
                result[index + 1] = String.valueOf(frequency[i]);

                index = index + 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take string input
        String text = input.nextLine();

        // Find character frequencies
        String[] result = findCharacterFrequency(text);

        // Display result
        System.out.println("Character\tFrequency");
        System.out.println("-------------------------");

        for (int i = 0; i < result.length; i = i + 2) {

            System.out.println(
                    result[i] + "\t\t" + result[i + 1]
            );
        }

        input.close();
    }
}
