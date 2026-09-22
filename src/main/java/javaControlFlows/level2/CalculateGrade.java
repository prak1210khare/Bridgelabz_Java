/*Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines
        Hint =>Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level2;
import java.util.Scanner;
public class CalculateGrade {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take marks of three subjects
        double physicsMarks = input.nextDouble();
        double chemistryMarks = input.nextDouble();
        double mathsMarks = input.nextDouble();

        // Calculate total marks
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;

        // Calculate average mark / percentage
        double averageMark = totalMarks / 3;

        // Declare grade and remarks
        char grade;
        String remarks;

        // Calculate grade and remarks
        if (averageMark >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (averageMark >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (averageMark >= 60) {
            grade = 'C';
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (averageMark >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (averageMark >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        // Display result
        System.out.println("Average Mark = " + averageMark + "%");
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);

        // Close Scanner
        input.close();
    }
}
