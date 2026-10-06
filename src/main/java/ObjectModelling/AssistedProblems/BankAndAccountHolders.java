/*Problem 2: Bank and Account Holders (Association)
Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
Tasks:
Define a Bank class and a Customer class.
Use an association relationship to show that each customer has an account in a bank.
Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
Author: Prakhar Khare
Date: 5-10-2026
 */
package ObjectModelling.AssistedProblems;
import java.util.ArrayList;

// Customer class
class Customer1 {

    private String name;
    private int customerId;

    // Store multiple accounts for one customer
    private ArrayList<BankAccount1> accounts;

    // Constructor
    Customer1(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        accounts = new ArrayList<>();
    }

    // Add account to customer
    public void addAccount(BankAccount1 account) {
        accounts.add(account);
    }

    // View balance of all accounts
    public void viewBalance() {

        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);

        for (BankAccount1 account : accounts) {
            System.out.println("Account Number: "
                    + account.getAccountNumber());

            System.out.println("Balance: "
                    + account.getBalance());

            System.out.println();
        }
    }
}

// Bank Account class
class BankAccount1 {

    private long accountNumber;
    private double balance;

    // Constructor
    BankAccount1(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Get account number
    public long getAccountNumber() {
        return accountNumber;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }
}

// Bank class
class Bank1 {

    private String bankName;

    // Constructor
    Bank1(String bankName) {
        this.bankName = bankName;
    }

    // Open account for a customer
    public void openAccount(Customer1 customer,
                            long accountNumber,
                            double initialBalance) {

        BankAccount1 account =
                new BankAccount1(accountNumber, initialBalance);

        customer.addAccount(account);

        System.out.println("Account opened successfully.");
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println();
    }
}

// Main class
public class BankAndAccountHolders {

    public static void main(String[] args) {

        // Create bank
        Bank1 bank = new Bank1("ABC Bank");

        // Create customers
        Customer1 customer1 =
                new Customer1("Prakhar", 101);

        Customer1 customer2 =
                new Customer1("Rahul", 102);

        // Open multiple accounts for customers
        bank.openAccount(customer1, 10001, 50000);
        bank.openAccount(customer1, 10002, 25000);

        bank.openAccount(customer2, 10003, 75000);

        // Customers view their balances
        System.out.println("Customer Account Details");
        System.out.println("-------------------------");

        customer1.viewBalance();

        customer2.viewBalance();
    }
}
