/*Sample Problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Author:Prakhar Khare
Date: 4-10-2026
 */
package Inheritance.HierarchicalInheritance;
// Superclass
class BankAccount {

    // Bank account attributes
    long accountNumber;
    double balance;

    // Constructor
    BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Method to display account type
    void displayAccountType() {
        System.out.println("Account Type: Bank Account");
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {

    // Unique attribute
    double interestRate;

    // Constructor
    SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Display account type
    @Override
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    // Display savings account details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// CheckingAccount subclass
class CheckingAccount extends BankAccount {

    // Unique attribute
    int withdrawalLimit;

    // Constructor
    CheckingAccount(long accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Display account type
    @Override
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    // Display checking account details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

// FixedDepositAccount subclass
class FixedDepositAccount extends BankAccount {

    // Unique attribute
    int depositPeriod;

    // Constructor
    FixedDepositAccount(long accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    // Display account type
    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    // Display fixed deposit details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Deposit Period: " + depositPeriod + " years");
    }
}

// Main class
public class BankAccountTypes {

    public static void main(String[] args) {

        // Create SavingsAccount object
        SavingsAccount savingsAccount =
                new SavingsAccount(1001, 50000, 6.5);

        // Create CheckingAccount object
        CheckingAccount checkingAccount =
                new CheckingAccount(1002, 30000, 20000);

        // Create FixedDepositAccount object
        FixedDepositAccount fixedDepositAccount =
                new FixedDepositAccount(1003, 100000, 5);

        // Display Savings Account details
        savingsAccount.displayAccountType();
        savingsAccount.displayDetails();

        System.out.println();

        // Display Checking Account details
        checkingAccount.displayAccountType();
        checkingAccount.displayDetails();

        System.out.println();

        // Display Fixed Deposit Account details
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayDetails();
    }
}
