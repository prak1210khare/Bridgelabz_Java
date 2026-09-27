/*Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint =>
Write a method to Generate a 6-digit OTP number using Math.random()
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
Author: Prakhar Khare
Date: 25-09-2026
 */
package javaMethods.level3;

public class GenerateOtp {
    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check whether all OTPs are unique
    public static boolean areOTPsUnique(int[] otpNumbers) {

        for (int i = 0; i < otpNumbers.length; i++) {
            for (int j = i + 1; j < otpNumbers.length; j++) {

                if (otpNumbers[i] == otpNumbers[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Create an array to store 10 OTPs
        int[] otpNumbers = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otpNumbers.length; i++) {
            otpNumbers[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");

        for (int otp : otpNumbers) {
            System.out.println(otp);
        }

        // Check whether all OTPs are unique
        boolean unique = areOTPsUnique(otpNumbers);

        System.out.println("Are all OTPs unique? " + unique);
    }
}
