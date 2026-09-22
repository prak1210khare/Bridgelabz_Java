/*Write a program to check
if the first, second, or third number is the largest of the three.
Author: Prakhar Khare
Date: 22-09-2026
*/
package javaControlFlows.level1;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check which number is the largest
        boolean isFirstLargest = number1 > number2 && number1 > number3;
        boolean isSecondLargest = number2 > number1 && number2 > number3;
        boolean isThirdLargest = number3 > number1 && number3 > number2;

        // Display results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        // Close Scanner
        input.close();
    }
}
