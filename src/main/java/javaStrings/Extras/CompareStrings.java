/*Compare Two Strings
Problem:
Write a Java program to compare two strings lexicographically (dictionary order) without
using built-in compare methods.
Example Input:
String 1: "apple"
String 2: "banana"

Expected Output:
        "apple" comes before "banana" in lexicographical order
Author: Prakhar Khare
Date: 30-09-2026
 */
package javaStrings.Extras;
import java.util.Scanner;
public class CompareStrings {

    // Method to compare two strings lexicographically
    public static int compareStrings(String string1, String string2) {

        int minimumLength;

        // Find the length of the shorter string
        if (string1.length() < string2.length()) {
            minimumLength = string1.length();
        } else {
            minimumLength = string2.length();
        }

        // Compare characters one by one
        for (int i = 0; i < minimumLength; i++) {

            char character1 = string1.charAt(i);
            char character2 = string2.charAt(i);

            if (character1 < character2) {
                return -1;
            }

            if (character1 > character2) {
                return 1;
            }
        }

        // If common characters are same, compare lengths
        if (string1.length() < string2.length()) {
            return -1;
        } else if (string1.length() > string2.length()) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take string inputs
        String string1 = input.nextLine();
        String string2 = input.nextLine();

        // Compare strings
        int result = compareStrings(string1, string2);

        // Display result
        if (result < 0) {
            System.out.println(
                    "\"" + string1 + "\" comes before \"" + string2
                            + "\" in lexicographical order"
            );
        } else if (result > 0) {
            System.out.println(
                    "\"" + string1 + "\" comes after \"" + string2
                            + "\" in lexicographical order"
            );
        } else {
            System.out.println("Both strings are equal");
        }

        input.close();
    }
}
