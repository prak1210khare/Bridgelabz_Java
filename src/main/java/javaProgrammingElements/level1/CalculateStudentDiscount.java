/*Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
        Hint =>
        Create a variable named fee and take user input for fee.
        Create another variable discountPercent and take user input.
        Compute the discount and assign it to the discount variable.
        Compute and print the fee you have to pay by subtracting the discount from the fee.
Author: Prakhar Khare
Date: 21-09-2026
 */

package javaProgrammingElements.level1;
import java.util.Scanner;
public class CalculateStudentDiscount {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();

        // Calculate discount
        double discount = (fee * discountPercent) / 100;

        // Calculate final discounted fee
        double discountedFee = fee - discount;

        // Display result
        System.out.println(
                "The discount amount is INR " + discount +
                        " and final discounted fee is INR " + discountedFee
        );

        input.close();
    }
}
