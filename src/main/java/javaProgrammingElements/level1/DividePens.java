/*Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
Hint =>
Use Modulus Operator (%) to find the reminder.
Use Division Operator to find the Quantity of pens
Author: Prakhar Khare
Date: 21-09-2026
*/
package javaProgrammingElements.level1;

public class DividePens {
    public static void main(String[] args) {

        // Fixed values
        int totalPens = 14;
        int numberOfStudents = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;

        // Display result
        System.out.println(
                "The Pen Per Student is " + pensPerStudent +
                        " and the remaining pen not distributed is " + remainingPens
        );
    }
}
