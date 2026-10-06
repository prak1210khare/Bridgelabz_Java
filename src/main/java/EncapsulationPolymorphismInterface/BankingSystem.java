/*4. Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.
Author: Prakhar Khare
Date: 5-10-2026
 */

package EncapsulationPolymorphismInterface;
import java.util.ArrayList;
import java.util.List;

// Interface
interface Loanable {

    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}

// Abstract class
abstract class BankAccount {

    // Private fields for encapsulation
    private long accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    BankAccount(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter for accountNumber
    public long getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for holderName
    public String getHolderName() {
        return holderName;
    }

    // Setter for holderName
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Abstract method
    abstract double calculateInterest();

    // Display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {

    // Interest rate
    private double interestRate;

    // Constructor
    SavingsAccount(long accountNumber, String holderName,
                   double balance, double interestRate) {

        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // Calculate savings interest
    @Override
    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // Apply for loan
    @Override
    public void applyForLoan(double amount) {

        if (calculateLoanEligibility()) {
            System.out.println(
                    "Loan of " + amount + " approved for Savings Account."
            );
        } else {
            System.out.println("Savings Account is not eligible for loan.");
        }
    }

    // Check loan eligibility
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 50000;
    }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {

    // Interest rate
    private double interestRate;

    // Constructor
    CurrentAccount(long accountNumber, String holderName,
                   double balance, double interestRate) {

        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // Calculate current account interest
    @Override
    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // Apply for loan
    @Override
    public void applyForLoan(double amount) {

        if (calculateLoanEligibility()) {
            System.out.println(
                    "Loan of " + amount + " approved for Current Account."
            );
        } else {
            System.out.println("Current Account is not eligible for loan.");
        }
    }

    // Check loan eligibility
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 100000;
    }
}

// Main class
public class BankingSystem {

    public static void main(String[] args) {

        // Create Savings Account
        SavingsAccount savingsAccount =
                new SavingsAccount(
                        1001,
                        "Prakhar",
                        80000,
                        6.5
                );

        // Create Current Account
        CurrentAccount currentAccount =
                new CurrentAccount(
                        1002,
                        "Rahul",
                        150000,
                        4.0
                );

        // Deposit and withdraw
        savingsAccount.deposit(10000);
        savingsAccount.withdraw(5000);

        System.out.println();

        currentAccount.deposit(20000);
        currentAccount.withdraw(10000);

        System.out.println();

        // Create BankAccount list
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        // Polymorphism
        for (BankAccount account : accounts) {

            account.displayDetails();

            // Calculate interest dynamically
            double interest = account.calculateInterest();

            System.out.println("Calculated Interest: " + interest);

            System.out.println();
        }

        // Loan operations
        savingsAccount.applyForLoan(50000);

        System.out.println();

        currentAccount.applyForLoan(100000);
    }
}