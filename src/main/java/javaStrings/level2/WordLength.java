/*Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint =>
Take user input using the Scanner nextLine() method
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method.
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
Author: Prakhar Khare
Date: 28-09-2026
 */

package javaStrings.level2;
import java.util.Scanner;
public class WordLength {
    // Method to find string length without using length()
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

    // Method to split text into words without using split()
    public static String[] splitWords(String text) {

        int textLength = findLength(text);

        // Count the number of words
        int wordCount = 1;

        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create array to store words
        String[] words = new String[wordCount];

        int wordIndex = 0;
        String word = "";

        // Read each character
        for (int i = 0; i < textLength; i++) {

            if (text.charAt(i) == ' ') {
                words[wordIndex] = word;
                wordIndex++;
                word = "";
            } else {
                word = word + text.charAt(i);
            }
        }

        // Store the last word
        words[wordIndex] = word;

        return words;
    }

    // Method to create 2D array containing word and length
    public static String[][] createWordLengthArray(String[] words) {

        String[][] wordLength = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            // Store the word
            wordLength[i][0] = words[i];

            // Find length and convert it to String
            int length = findLength(words[i]);
            wordLength[i][1] = String.valueOf(length);
        }

        return wordLength;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take complete line as input
        String text = input.nextLine();

        // Split text into words
        String[] words = splitWords(text);

        // Create 2D array containing words and lengths
        String[][] wordLength = createWordLengthArray(words);

        // Display result in tabular format
        System.out.println("Word\tLength");
        System.out.println("----------------");

        for (int i = 0; i < wordLength.length; i++) {

            // Convert String length back to Integer
            int length = Integer.parseInt(wordLength[i][1]);

            System.out.println(
                    wordLength[i][0] + "\t" + length
            );
        }

        input.close();
    }

}
