/*Problem 3: Bank Account Management
Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).
Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.
Author: Prakhar Khare
Date: 1-10-2026
 */

package javaConstructors.AccessModifiers;
class BankAccount {

    // Public variable
    public long accountNumber;

    // Protected variable
    protected String accountHolder;

    // Private variable
    private double balance;

    // Constructor
    BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to access balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    SavingsAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Demonstrate access to public and protected members
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankAccountManagement {

    public static void main(String[] args) {

        // Create BankAccount object
        BankAccount account =
                new BankAccount(1234567890L, "Prakhar", 50000);

        // Access public account number directly
        System.out.println("Account Number: " + account.accountNumber);

        // Access private balance using getter
        System.out.println("Initial Balance: " + account.getBalance());

        // Modify private balance using setter
        account.setBalance(75000);

        System.out.println("Updated Balance: " + account.getBalance());

        System.out.println();

        // Create SavingsAccount object
        SavingsAccount savingsAccount =
                new SavingsAccount(9876543210L, "Rahul", 60000);

        // Access public and protected members
        savingsAccount.displayAccountDetails();
    }
}
