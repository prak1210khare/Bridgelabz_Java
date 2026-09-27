/*Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
Hint =>
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
Create a Method to display the 2D Array of Strings in a Tabular Format
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
Auhtor: Prakhar Khare
Date: 28-09-2026
 */

package javaStrings.level2;
import java.util.Scanner;
public class VowelConsonant1 {
    // Method to check whether a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char character) {

        // Convert uppercase letter to lowercase using ASCII values
        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }

        // Check for vowel
        if (character == 'a' || character == 'e' ||
                character == 'i' || character == 'o' ||
                character == 'u') {

            return "Vowel";
        }

        // Check for consonant
        if (character >= 'a' && character <= 'z') {
            return "Consonant";
        }

        // Character is not a letter
        return "Not a Letter";
    }

    // Method to find the type of each character
    public static String[][] findCharacterTypes(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {

            // Get character using charAt()
            char character = text.charAt(i);

            // Store character
            result[i][0] = String.valueOf(character);

            // Store character type
            result[i][1] = checkCharacter(character);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] result) {

        System.out.println("Character\tType");
        System.out.println("---------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" + result[i][1]
            );
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take string input
        String text = input.nextLine();

        // Find character types
        String[][] result = findCharacterTypes(text);

        // Display result
        displayTable(result);

        input.close();
    }
}
