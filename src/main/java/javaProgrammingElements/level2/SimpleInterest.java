/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
        Hint => Simple Interest = Principal * Rate * Time / 100
Auhtor: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level2;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display result
        System.out.println(
                "The Simple Interest is " + simpleInterest
                        + " for Principal " + principal
                        + ", Rate of Interest " + rate
                        + " and Time " + time
        );

        // Close Scanner
        input.close();
    }
}
