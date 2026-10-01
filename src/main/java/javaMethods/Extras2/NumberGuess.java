/*Number Guessing Game:
 ○ Write a Java program where the user thinks of a number between 1 and 100, and
the computer tries to guess the number by generating random guesses.
○ The user provides feedback by indicating whether the guess is high, low, or
correct. The program should be modular, with different functions for generating
guesses, receiving user feedback, and determining the next guess.
Author: Prakhar Khare
Date: 30-09-2026
 */
package javaMethods.Extras2;
import java.util.Scanner;

public class NumberGuess {

    // Method to generate a random guess
    public static int generateGuess(int lowerLimit, int upperLimit) {
        return lowerLimit
                + (int) (Math.random() * (upperLimit - lowerLimit + 1));
    }

    // Method to receive feedback from the user
    public static String getFeedback(Scanner input) {
        System.out.print("Enter feedback (high/low/correct): ");
        return input.next().toLowerCase();
    }

    // Method to determine the next guess
    public static int determineNextGuess(
            int guess, String feedback, int lowerLimit, int upperLimit) {

        if (feedback.equals("high")) {
            upperLimit = guess - 1;
        } else if (feedback.equals("low")) {
            lowerLimit = guess + 1;
        }

        return generateGuess(lowerLimit, upperLimit);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lowerLimit = 1;
        int upperLimit = 100;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess your number.");

        while (lowerLimit <= upperLimit) {

            // Generate computer's guess
            int guess = generateGuess(lowerLimit, upperLimit);

            System.out.println("\nMy guess is: " + guess);

            // Get feedback from user
            String feedback = getFeedback(input);

            // Check if the guess is correct
            if (feedback.equals("correct")) {
                System.out.println(
                        "I guessed your number correctly!"
                );
                break;
            }

            // Update the range based on feedback
            if (feedback.equals("high")) {
                upperLimit = guess - 1;
            } else if (feedback.equals("low")) {
                lowerLimit = guess + 1;
            } else {
                System.out.println(
                        "Invalid feedback. Please enter high, low, or correct."
                );
                continue;
            }
        }

        input.close();
    }
}
