/*Sample Program 1: Bank Account System
Create a BankAccount class with the following features:
Static:
A static variable bankName shared across all accounts.
A static method getTotalAccounts() to display the total number of accounts.
This:
Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
        Final:
Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
Check if an account object is an instance of the BankAccount class before displaying its details.
Author: Prakhar Khare
Date: 1-10-2026
 */
package ThisStaticFinal;
class BankAccount {

    // Static variable shared by all accounts
    static String bankName = "ABC Bank";

    // Static variable to count total accounts
    static int totalAccounts = 0;

    // Instance variables
    String accountHolderName;

    // Final variable cannot be changed after initialization
    final long accountNumber;

    // Constructor
    BankAccount(String accountHolderName, long accountNumber) {

        // 'this' resolves ambiguity between parameter and instance variable
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        // Increase account count
        totalAccounts++;
    }

    // Static method to display total accounts
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {

        // Create BankAccount objects
        BankAccount account1 =
                new BankAccount("Prakhar", 1001);

        BankAccount account2 =
                new BankAccount("Rahul", 1002);

        // Check whether account1 is an instance of BankAccount
        if (account1 instanceof BankAccount) {
            System.out.println("Account 1 is a BankAccount.");
            account1.displayDetails();
        }

        System.out.println();

        // Check whether account2 is an instance of BankAccount
        if (account2 instanceof BankAccount) {
            System.out.println("Account 2 is a BankAccount.");
            account2.displayDetails();
        }

        System.out.println();

        // Call static method using class name
        BankAccount.getTotalAccounts();
    }
}
