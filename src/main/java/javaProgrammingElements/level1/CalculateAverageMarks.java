/*Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100.
Find the average percent mark in PCM.
Author: Prakhar Khare
Date: 21-09-2026
 */

package javaProgrammingElements.level1;

public class CalculateAverageMarks {
    public static void main(String[] args) {

        // Fixed values
        double mathsMarks = 94;
        double physicsMarks = 95;
        double chemistryMarks = 96;

        // Calculate average marks
        double averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / 3;

        // Display result
        System.out.println("Sam's average mark in PCM is " + averageMarks);
    }
}
