//  Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

import java.util.ArrayList;
import java.util.List;

// Account class to maintain account details
class Account {
    private int accountId;
    private String customerName;
    private double balance;

    // Constructor
    public Account(int accountId, String customerName, double balance) {
        this.accountId = accountId;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully. Current balance: " + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    // Getters and setters
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Bank class with a collection of accounts
class Bank_oop {
    private List<Account> accounts;

    // Constructor
    public Bank_oop() {
        accounts = new ArrayList<>();
    }

    // Method to add an account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    // Method to remove an account
    public void removeAccount(int accountId) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                accounts.remove(account);
                System.out.println("Account removed successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Getters and setters
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    public static void main(String[] args) {
        // Create a bank object
        Bank_oop bank = new Bank_oop();

        // Create and add accounts
        Account account1 = new Account(1, "John Doe", 1000);
        Account account2 = new Account(2, "Jane Smith", 2000);
        bank.addAccount(account1);
        bank.addAccount(account2);

        // Deposit and withdraw money
        account1.deposit(500);
        account2.withdraw(1000);

        // Display account details
        for (Account account : bank.getAccounts()) {
            System.out.println("Account ID: " + account.getAccountId());
            System.out.println("Customer Name: " + account.getCustomerName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println();
        }
    }
}
