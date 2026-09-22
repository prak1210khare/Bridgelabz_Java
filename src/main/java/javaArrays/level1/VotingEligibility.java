/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint =>
Define an array of 10 integer elements and take user input for the student's age.
Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote.
Author: Prakhar Khare
Date: 22-09-2026
*/

package javaArrays.level1;
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create an array to store the age of 10 students
        int[] ages = new int[10];

        // Take age input for 10 students
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {

            // Check for invalid age
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);

                // Check if student can vote
            } else if (ages[i] >= 18) {
                System.out.println(
                        "The student with the age " + ages[i] + " can vote."
                );

                // Student cannot vote
            } else {
                System.out.println(
                        "The student with the age " + ages[i] + " cannot vote."
                );
            }
        }

        // Close Scanner
        input.close();
    }
}
