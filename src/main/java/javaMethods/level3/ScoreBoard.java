/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the total, average, and the percentage score

Hint =>
Take input for the number of students
Write a method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using the Math.round() method.
Finally, write a Method to display the scorecard of all students with their scores, total, average, and percentage in a tabular format using "\t".

 */

package javaMethods.level3;

public class ScoreBoard {
    // Method to generate random 2-digit PCM scores
    public static int[][] generateScores(int numberOfStudents) {

        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {

            // Generate 2-digit marks from 10 to 99
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }

        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {

        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            // Calculate total marks
            double total = scores[i][0] + scores[i][1] + scores[i][2];

            // Calculate average marks
            double average = total / 3;

            // Calculate percentage
            double percentage = (total / 300) * 100;

            // Round values to 2 decimal places
            total = Math.round(total * 100.0) / 100.0;
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to display the scorecard
    public static void displayScoreCard(
            int[][] scores,
            double[][] results) {

        System.out.println(
                "Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage"
        );

        System.out.println(
                "--------------------------------------------------------------------------"
        );

        for (int i = 0; i < scores.length; i++) {

            System.out.printf(
                    "%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f%%%n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2]
            );
        }
    }

    public static void main(String[] args) {

        // Number of students
        int numberOfStudents = 5;

        // Generate PCM scores
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Display scorecard
        displayScoreCard(scores, results);
    }
}
