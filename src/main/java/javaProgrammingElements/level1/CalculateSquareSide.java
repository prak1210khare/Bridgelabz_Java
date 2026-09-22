/*Write a program to find the side of the square whose parameter you read from user
        Hint => Perimeter of Square is 4 times side
Auhtor: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level1;
import java.util.Scanner;
public class CalculateSquareSide {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take perimeter as input
        double perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Display result
        System.out.println(
                "The length of the side is " + side +
                        " whose perimeter is " + perimeter
        );

        input.close();
    }
}
