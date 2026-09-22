/*Create a program to find the maximum number of handshakes among N number of students.
        Hint =>
        Get integer input for numberOfStudents variable.
        Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
        Display the number of possible handshakes.
Author: Prakhar Khare
Date:21-09-2026
 */
package javaProgrammingElements.level1;
import java.util.Scanner;
public class MaximumHandShakes {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of students as input
        int numberOfStudents = input.nextInt();

        // Calculate maximum number of handshakes
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println(
                "Number of students = " + numberOfStudents +
                        "\nMaximum number of handshakes = " + maximumHandshakes
        );

        input.close();
    }
}
