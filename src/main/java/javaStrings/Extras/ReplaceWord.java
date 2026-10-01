/*Write a replace method in Java that replaces a given word with another word in a
sentence:

 */
package javaStrings.Extras;
import java.util.Scanner;

public class ReplaceWord {

    // Method to replace a word in the sentence
    public static String replaceWord(
            String sentence, String oldWord, String newWord) {

        String result = "";
        String[] words = sentence.split(" ");

        // Check each word
        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(oldWord)) {
                result = result + newWord;
            } else {
                result = result + words[i];
            }

            // Add space between words
            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take sentence input
        String sentence = input.nextLine();

        // Take word to replace
        String oldWord = input.next();

        // Take replacement word
        String newWord = input.next();

        // Replace the word
        String result = replaceWord(sentence, oldWord, newWord);

        // Display result
        System.out.println("Original Sentence = " + sentence);
        System.out.println("Modified Sentence = " + result);

        input.close();
    }
}