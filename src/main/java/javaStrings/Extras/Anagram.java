/*11. Write a Java program that accepts two strings from the user and checks if the two
strings are anagrams of each other (i.e., whether they contain the same characters in any
 order).

 */
package javaStrings.Extras;
import java.util.Scanner;

public class Anagram {

    // Method to check if two strings are anagrams
    public static boolean checkAnagram(String string1, String string2) {

        // If lengths are different, they cannot be anagrams
        if (string1.length() != string2.length()) {
            return false;
        }

        // Create frequency arrays
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Count characters in first string
        for (int i = 0; i < string1.length(); i++) {
            char character = string1.charAt(i);
            frequency1[character]++;
        }

        // Count characters in second string
        for (int i = 0; i < string2.length(); i++) {
            char character = string2.charAt(i);
            frequency2[character]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take two strings as input
        String string1 = input.nextLine();
        String string2 = input.nextLine();

        // Check if strings are anagrams
        boolean result = checkAnagram(string1, string2);

        // Display result
        if (result) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        input.close();
    }
}
