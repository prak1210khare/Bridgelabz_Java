/*Write a program to input the unit price of an item and the quantity to be bought.
 Then, calculate the total price.
 Auhtor: Prakhar Khare
 Date: 21-09-2026
 */
package javaProgrammingElements.level1;
import java.util.Scanner;
public class CalculateTotalPrice {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();

        // Calculate total purchase price
        double totalPrice = unitPrice * quantity;

        // Display result
        System.out.println(
                "The total purchase price is INR " + totalPrice +
                        " if the quantity " + quantity +
                        " and unit price is INR " + unitPrice
        );

        input.close();
    }
}
