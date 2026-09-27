/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint =>
Take user input using the Scanner nextLine() method
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method.
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array.
The main function calls the user-defined methods and displays the result.
Auhtor: Prakhar Khare
Date: 28-09-2026
 */
package javaStrings.level2;

import java.util.Scanner;

public class ShortandLong {
    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            // Exception occurs when index reaches the end
        }

        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitWords(String text) {

        int textLength = findLength(text);

        // Count number of words
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

        // Extract each word
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

    // Method to create 2D array containing word and its length
    public static String[][] createWordLengthArray(String[] words) {

        String[][] wordLength = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            // Store word
            wordLength[i][0] = words[i];

            // Find length and convert it to String
            int length = findLength(words[i]);
            wordLength[i][1] = String.valueOf(length);
        }

        return wordLength;
    }

    // Method to find shortest and longest word
    public static int[] findShortestAndLongest(String[][] wordLength) {

        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordLength.length; i++) {

            // Convert String length to integer
            int currentLength = Integer.parseInt(wordLength[i][1]);
            int shortestLength = Integer.parseInt(wordLength[shortestIndex][1]);
            int longestLength = Integer.parseInt(wordLength[longestIndex][1]);

            // Find shortest word
            if (currentLength < shortestLength) {
                shortestIndex = i;
            }

            // Find longest word
            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take complete line as input
        String text = input.nextLine();

        // Split text into words
        String[] words = splitWords(text);

        // Create 2D array of words and lengths
        String[][] wordLength = createWordLengthArray(words);

        // Find shortest and longest word
        int[] result = findShortestAndLongest(wordLength);

        // Get indexes of shortest and longest words
        int shortestIndex = result[0];
        int longestIndex = result[1];

        // Display results
        System.out.println("Shortest word = " + wordLength[shortestIndex][0]);
        System.out.println(
                "Length of shortest word = "
                        + wordLength[shortestIndex][1]
        );

        System.out.println("Longest word = " + wordLength[longestIndex][0]);
        System.out.println(
                "Length of longest word = "
                        + wordLength[longestIndex][1]
        );

        input.close();
    }

}
