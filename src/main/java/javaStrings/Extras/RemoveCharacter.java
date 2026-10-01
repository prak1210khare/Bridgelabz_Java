/*Remove a Specific Character from a String
Problem:
Write a Java program to remove all occurrences of a specific character from a string.
Example Input:
String: "Hello World"
Character to Remove: 'l'

Expected Output:
Modified String: "Heo Word"
Author: Prakhar Khare
Date: 30-09-2026
 */
package javaStrings.Extras;
import java.util.Scanner;

public class RemoveCharacter {

    // Method to remove all occurrences of a character
    public static String removeCharacter(String text, char characterToRemove) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            // Add character only if it is not the character to remove
            if (character != characterToRemove) {
                result = result + character;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take string input
        String text = input.nextLine();

        // Take character to remove
        char characterToRemove = input.next().charAt(0);

        // Remove the character
        String result = removeCharacter(text, characterToRemove);

        // Display result
        System.out.println("Original String = " + text);
        System.out.println("Modified String = " + result);

        input.close();
    }
}
