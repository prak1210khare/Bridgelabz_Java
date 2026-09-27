/*Find unique characters in a string using the charAt() method and display the result
Hint =>
Create a Method to find the length of the text without using the String method length()
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array. The logic used here is as follows:
Create an array to store the unique characters in the text. The size is the length of the text
Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array
Create a new array to store the unique characters
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
Author: Prakhar Khare
Date: 28-09-2026
 */

package javaStrings.level3;
import java.util.Scanner;
public class UniqueCharacters {
    // Method to find length without using length()
    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            // Exception occurs when count reaches the end
        }

        return count;
    }

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {

        // Find length of the text
        int textLength = findLength(text);

        // Create an array with size equal to text length
        char[] uniqueCharacters = new char[textLength];

        int uniqueCount = 0;

        // Outer loop checks each character
        for (int i = 0; i < textLength; i++) {

            char currentCharacter = text.charAt(i);

            boolean isUnique = true;

            // Inner loop checks previous characters
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

        // Create a new array containing only unique characters
        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueCharacters[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take string input
        String text = input.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Display result
        System.out.println("Unique characters:");

        for (char character : uniqueCharacters) {
            System.out.print(character + " ");
        }

        input.close();
    }
}
