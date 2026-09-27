package javaStrings.level3;

import java.util.Scanner;

public class Anagram {
    // Method to check if two texts are anagrams
    public static boolean checkAnagram(String text1, String text2) {

        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create frequency arrays for both texts
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Find frequency of characters in first text
        for (int i = 0; i < text1.length(); i++) {
            char character = text1.charAt(i);
            frequency1[character]++;
        }

        // Find frequency of characters in second text
        for (int i = 0; i < text2.length(); i++) {
            char character = text2.charAt(i);
            frequency2[character]++;
        }

        // Compare the frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user inputs
        String text1 = input.nextLine();
        String text2 = input.nextLine();

        // Check if texts are anagrams
        boolean result = checkAnagram(text1, text2);

        // Display result
        System.out.println("Are the two texts anagrams? " + result);

        input.close();
    }

}
