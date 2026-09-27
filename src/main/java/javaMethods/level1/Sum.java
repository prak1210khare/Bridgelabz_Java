/*Write a program to find the sum of n natural numbers using loop
        Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop
Author: Prakhar Khare
Date: 24-09-2026
 */
package javaMethods.level1;
import java.util.Scanner;
public class Sum {
    public static int calculateSum(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from user
        int number = input.nextInt();

        // Calculate sum
        int sum = calculateSum(number);

        // Display result
        System.out.println(
                "The sum of " + number + " natural numbers is " + sum
        );

        input.close();
    }
}
