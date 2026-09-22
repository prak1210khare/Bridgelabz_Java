/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines

Hint =>
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student
 */

package javaArrays.level2;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number of students
        int numberOfStudents = input.nextInt();

        // Create arrays to store marks, percentage, and grade
        double[][] marks = new double[numberOfStudents][3];
        double[] percentage = new double[numberOfStudents];
        char[] grade = new char[numberOfStudents];

        // Take marks for each student
        for (int i = 0; i < numberOfStudents; i++) {

            double physicsMarks = input.nextDouble();
            double chemistryMarks = input.nextDouble();
            double mathsMarks = input.nextDouble();

            // Check for negative marks
            if (physicsMarks < 0 || chemistryMarks < 0 || mathsMarks < 0) {
                System.out.println("Marks cannot be negative. Please enter positive marks.");
                i--;
                continue;
            }

            // Store marks
            marks[i][0] = physicsMarks;
            marks[i][1] = chemistryMarks;
            marks[i][2] = mathsMarks;

            // Calculate percentage
            double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
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
