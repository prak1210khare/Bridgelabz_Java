/*Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
Hint =>
All the steps are the same as the problem 8 except the marks are stored in a 2D array
Use the 2D array to calculate the percentages, and grades of the students
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaArrays.level2;
import java.util.Scanner;
public class Grade2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number of students
        int numberOfStudents = input.nextInt();

        // Create a 2D array to store marks of 3 subjects
        double[][] marks = new double[numberOfStudents][3];

        // Create arrays to store percentage and grade
        double[] percentage = new double[numberOfStudents];
        char[] grade = new char[numberOfStudents];

        // Take marks for each student
        for (int i = 0; i < numberOfStudents; i++) {

            double physicsMarks = input.nextDouble();
            double chemistryMarks = input.nextDouble();
            double mathsMarks = input.nextDouble();

            // Check for negative marks
            if (physicsMarks < 0 || chemistryMarks < 0 || mathsMarks < 0) {
                System.out.println(
                        "Marks cannot be negative. Please enter positive marks."
                );
                i--;
                continue;
            }

            // Store marks in the 2D array
            marks[i][0] = physicsMarks;
            marks[i][1] = chemistryMarks;
            marks[i][2] = mathsMarks;

            // Calculate percentage using the 2D array
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = totalMarks / 3;

            // Calculate grade
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Display marks, percentage, and grade
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics Marks = " + marks[i][0]);
            System.out.println("Chemistry Marks = " + marks[i][1]);
            System.out.println("Maths Marks = " + marks[i][2]);
            System.out.println("Percentage = " + percentage[i] + "%");
            System.out.println("Grade = " + grade[i]);
            System.out.println();
        }

        input.close();
    }
}
