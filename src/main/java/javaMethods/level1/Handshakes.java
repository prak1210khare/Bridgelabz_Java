/*Create a program to find the maximum number of handshakes among N number of students.
        Hint =>
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
Author: Prakhar Khare
Date: 23-09-2026
 */

package javaMethods.level1;
import java.util.Scanner;
public class Handshakes {
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

        public static void main (String[]args){
            Scanner input = new Scanner(System.in);

            // Get number of students
            int numberOfStudents = input.nextInt();

            // Calculate maximum handshakes
            int maximumHandshakes = calculateHandshakes(numberOfStudents);

            // Display result
            System.out.println(
                    "The maximum number of handshakes is " + maximumHandshakes
            );

            input.close();
        }
    }
