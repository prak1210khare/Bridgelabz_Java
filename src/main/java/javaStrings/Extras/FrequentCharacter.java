/*Problem:
 Write a Java program to find the most frequent character in a string.
Example Input:
String: "success"
 Expected Output:
 Most Frequent Character: 's'
Author: Prakhar Khare
Date: 30-09-2026
*/
package javaStrings.Extras;
import java.util.Scanner;

public class FrequentCharacter {

    // Method to find the most frequent character
    public static char findMostFrequentCharacter(String text) {

        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            frequency[character]++;
        }

        // Find character with highest frequency
        char mostFrequentCharacter = text.charAt(0);
        int maximumFrequency = frequency[mostFrequentCharacter];

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            if (frequency[character] > maximumFrequency) {
                maximumFrequency = frequency[character];
                mostFrequentCharacter = character;
            }
        }

        return mostFrequentCharacter;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take string input
        String text = input.nextLine();

        // Find most frequent character
        char result = findMostFrequentCharacter(text);

        // Display result
        System.out.println(
                "Most Frequent Character: '" + result + "'"
        );

        input.close();
    }
}
