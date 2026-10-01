/*Program to Check Palindrome String
Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.
Author: Prakhar Khare
Date: 1-10-2026
 */

package ClassandObject.level2;
class PalindromeChecker {
    // Attribute
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    boolean checkPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method to display the result
    void displayResult() {
        if (checkPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {

        // Create PalindromeChecker object
        PalindromeChecker palindromeChecker =
                new PalindromeChecker("madam");

        // Display the result
        palindromeChecker.displayResult();
    }
}
