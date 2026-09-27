package javaMethods.level3;
import java.util.Scanner;
public class CheckNumber {
    // Method to find the count of digits
    public static int countDigits(int number) {
        int count = 0;

        if (number == 0) {
            return 1;
        }

        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];

        int index = digitCount - 1;

        if (number == 0) {
            digits[0] = 0;
            return digits;
        }

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index--;
        }

        return digits;
    }

    // Method to find sum of digits
    public static int findDigitSum(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum = sum + digit;
        }

        return sum;
    }

    // Method to find sum of squares of digits
    public static double findDigitSquareSum(int[] digits) {
        double sum = 0;

        for (int digit : digits) {
            sum = sum + Math.pow(digit, 2);
        }

        return sum;
    }

    // Method to check whether a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = findDigitSum(digits);

        if (sum == 0) {
            return false;
        }

        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        // Store digits in the first column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count frequency in the second column
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Count digits
        int digitCount = countDigits(number);

        // Store digits in array
        int[] digits = storeDigits(number);

        // Find sum of digits
        int digitSum = findDigitSum(digits);

        // Find sum of squares
        double squareSum = findDigitSquareSum(digits);

        // Check Harshad number
        boolean isHarshad = isHarshadNumber(number, digits);

        // Find digit frequency
        int[][] frequency = findDigitFrequency(digits);

        // Display results
        System.out.println("Number of digits = " + digitCount);

        System.out.print("Digits = ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Sum of digits = " + digitSum);
        System.out.println("Sum of squares of digits = " + squareSum);
        System.out.println("Is Harshad Number? " + isHarshad);

        System.out.println("Digit Frequency:");

        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(
                        "Digit " + frequency[i][0]
                                + " = " + frequency[i][1] + " time(s)"
                );
            }
        }

        input.close();
    }
}
