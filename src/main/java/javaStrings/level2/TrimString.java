/*Write a program to trim the leading and trailing spaces from a string using the charAt() method
        Hint =>
        Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
        Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
        Write a method to compare two strings using the charAt() method and return a boolean result
        The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
Author: Prakhar Khare
Date: 28-09-2026
 */
package javaStrings.level2;
import java.util.Scanner;
public class TrimString {
    // Method to find the starting and ending indexes after removing spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Find the first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        // end is inclusive here
        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String string1, String string2) {

        // Compare lengths first
        if (string1.length() != string2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < string1.length(); i++) {

            if (string1.charAt(i) != string2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take string input
        String text = input.nextLine();

        // Find starting and ending indexes
        int[] indexes = findTrimIndexes(text);

        int start = indexes[0];
        int end = indexes[1];

        // Create trimmed string using user-defined method
        String userDefinedTrimmedText;

        // Handle a string containing only spaces
        if (start > end) {
            userDefinedTrimmedText = "";
        } else {
            userDefinedTrimmedText = createSubstring(text, start, end);
        }

        // Trim using built-in trim() method
        String builtInTrimmedText = text.trim();

        // Compare both strings
        boolean result = compareStrings(
                userDefinedTrimmedText,
                builtInTrimmedText
        );

        // Display results
        System.out.println(
                "Trimmed string using user-defined method = \""
                        + userDefinedTrimmedText + "\""
        );

        System.out.println(
                "Trimmed string using built-in trim() method = \""
                        + builtInTrimmedText + "\""
        );

        System.out.println("Are both strings equal? " + result);

        input.close();
    }
}
