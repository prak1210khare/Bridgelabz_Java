/*Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
Explanation: The BankAccount class stores bank account details as attributes. The methods allow interaction with these attributes to modify and view the account's state.
Author: Prakhar Khare
Date: 1-10-2026
 */
package ClassandObject.level2;
class BankAccount {
    // Attributes
    String accountHolder;
    long accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {

        // Create BankAccount object
        BankAccount account = new BankAccount(
                "Prakhar",
                1234567890L,
                50000
        );

        // Deposit money
        account.deposit(10000);

        // Withdraw money
        account.withdraw(15000);

        // Display current balance
        account.displayBalance();
    }
}