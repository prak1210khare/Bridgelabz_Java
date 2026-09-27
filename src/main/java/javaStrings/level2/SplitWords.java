/*Write a program to split the text into words, compare the result with the split() method and display the result
        Hint =>
        Take user input using the Scanner nextLine() method
        Create a Method to find the length of the String without using the built-in length() method.
        Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
        Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
        Then Create an array to store the words and use the indexes to extract the words
        Create a method to compare the two String arrays and return a boolean
        The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
 Author: Prakhar Khare
 Date: 28-09-2026
 */

package javaStrings.level2;
import java.util.Scanner;
public class SplitWords {
    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            // Exception occurs when count reaches the end of the string
        }

        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitWords(String text) {

        // Find the length of the string
        int length = findLength(text);

        // Count the number of words
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store the positions of spaces
        int[] spaceIndexes = new int[wordCount - 1];

        int spaceIndex = 0;

        // Store the indexes of spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex] = i;
                spaceIndex++;
            }
        }

        // Array to store the words
        String[] words = new String[wordCount];

        // Extract the first word
        String word = "";

        if (wordCount > 1) {
            for (int i = 0; i < spaceIndexes[0]; i++) {
                word = word + text.charAt(i);
            }
        } else {
            for (int i = 0; i < length; i++) {
                word = word + text.charAt(i);
            }
        }

        words[0] = word;

        // Extract middle and last words
        for (int i = 1; i < wordCount; i++) {

            int startIndex = spaceIndexes[i - 1] + 1;
            int endIndex;

            if (i == wordCount - 1) {
                endIndex = length;
            } else {
                endIndex = spaceIndexes[i];
            }

            word = "";

            for (int j = startIndex; j < endIndex; j++) {
                word = word + text.charAt(j);
            }

            words[i] = word;
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] array1, String[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take complete line as input
        String text = input.nextLine();

        // Split using user-defined method
        String[] userDefinedWords = splitWords(text);

        // Split using built-in split() method
        String[] builtInWords = text.split(" ");

        // Display user-defined result
        System.out.println("Words using user-defined method:");

        for (String word : userDefinedWords) {
            System.out.println(word);
        }

        // Display built-in result
        System.out.println("\nWords using built-in split() method:");

        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Compare both arrays
        boolean result = compareArrays(userDefinedWords, builtInWords);

        System.out.println("\nAre both results equal? " + result);

        input.close();
    }
}
