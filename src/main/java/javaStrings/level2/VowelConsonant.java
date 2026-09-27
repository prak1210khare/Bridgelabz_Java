/*Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint =>
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
Author: Prakhar Khare
Date: 28-09-2026
 */

package javaStrings.level2;
import java.util.Scanner;
public class VowelConsonant {
    // Method to check whether a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char character) {

        // Convert uppercase letter to lowercase using ASCII
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

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        // Check every character using charAt()
        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            String result = checkCharacter(character);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take string input
        String text = input.nextLine();

        // Count vowels and consonants
        int[] result = countVowelsAndConsonants(text);

        // Display results
        System.out.println("Number of Vowels = " + result[0]);
        System.out.println("Number of Consonants = " + result[1]);

        input.close();
    }
}
