/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below
Hint =>
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format
Author: Prakhar Khare
Date: 28-09-2026
 */

package javaStrings.level2;

public class ScoreCard {
    // Method to generate random 2-digit PCM scores
    public static int[][] generateScores(int numberOfStudents) {

        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {

            // Generate marks from 10 to 99
            scores[i][0] = (int) (Math.random() * 90) + 10; // Physics
            scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int) (Math.random() * 90) + 10; // Maths
        }

        return scores;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores) {

        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            // Calculate total
            double total = scores[i][0] + scores[i][1] + scores[i][2];

            // Calculate average
            double average = total / 3;

            // Calculate percentage
            double percentage = (total / 300) * 100;

            // Round to 2 decimal places
            total = Math.round(total * 100.0) / 100.0;
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            // Store results
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to calculate grade based on percentage
    public static String[][] calculateGrades(double[][] results) {

        String[][] grades = new String[results.length][1];

        for (int i = 0; i < results.length; i++) {

            double percentage = results[i][2];

            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R";
            }
        }

        return grades;
    }

    // Method to display the scorecard
    public static void displayScoreCard(
            int[][] scores,
            double[][] results,
            String[][] grades) {

        System.out.println(
                "Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade"
        );

        System.out.println(
                "-------------------------------------------------------------------------------"
        );

        for (int i = 0; i < scores.length; i++) {

            System.out.printf(
                    "%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f%%\t\t%s%n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i][0]
            );
        }
    }

    public static void main(String[] args) {

        // Number of students
        int numberOfStudents = 5;

        // Generate PCM scores
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average and percentage
        double[][] results = calculateResults(scores);

        // Calculate grades
        String[][] grades = calculateGrades(results);

        // Display scorecard
        displayScoreCard(scores, results, grades);
    }
}
