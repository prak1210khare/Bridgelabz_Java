/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint =>
Create a method to define the random 2-digit age of several students provided as method parameters and return a 1D array of ages of n students
Create a method that takes an array of age as a parameter and returns a 2D String array of age and a boolean true or false to indicate can and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to set true to indicate can vote.
Create a method to display the 2D array in a tabular format.
        Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
Author: Prakhar Khare
Date: 28-09-2026
 */

package javaStrings.level2;

public class VoteChecker {
    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int numberOfStudents) {

        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            // Generate age from 10 to 99
            ages[i] = (int) (Math.random() * 90) + 10;
        }

        return ages;
    }

    // Method to check whether students can vote
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            int age = ages[i];

            // Store age as String
            result[i][0] = String.valueOf(age);

            // Check voting eligibility
            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResult(String[][] result) {

        System.out.println("Student\tAge\tCan Vote");
        System.out.println("----------------------------");

        for (int i = 0; i < result.length; i++) {

            System.out.println(
                    (i + 1) + "\t"
                            + result[i][0] + "\t"
                            + result[i][1]
            );
        }
    }

    public static void main(String[] args) {

        // Number of students
        int numberOfStudents = 10;

        // Generate ages
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display result
        displayResult(result);
    }

}
