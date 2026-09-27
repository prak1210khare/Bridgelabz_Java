/*Write a program to find the frequency of characters in a string using the charAt() method and display the result
Hint =>
Create a method to find the frequency of characters in a string using the charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.
Author: Prakhar Khare
Date: 28-09-2026
 */
package javaStrings.level3;
import java.util.Scanner;
public class CharFreq {
    // Method to find character frequency
    public static String[][] findCharacterFrequency(String text) {

        // Array to store frequency of 256 ASCII characters
        int[] frequency = new int[256];

        // Find frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            frequency[character]++;
        }

        // Count the number of unique characters
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            // Check whether this character appeared before
            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == character) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                uniqueCount++;
            }
        }

        // Create 2D array to store character and frequency
        String[][] result = new String[uniqueCount][2];

        int index = 0;

        // Store characters and their frequencies
        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            // Check whether character was already stored
            boolean alreadyStored = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == character) {
                    alreadyStored = true;
                    break;
                }
            }

            if (!alreadyStored) {
                result[index][0] = String.valueOf(character);
                result[index][1] = String.valueOf(frequency[character]);
                index++;
            }
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
