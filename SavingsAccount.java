// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

// BankAccount class
class BankAccount {
    // Property
    protected double balance;

    // Constructor
    public BankAccount() {
        balance = 0;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }
}

// SavingsAccount subclass extending BankAccount
class SavingsAccount extends BankAccount {
    // Constructor
    public SavingsAccount() {
        super(); // Call superclass constructor
    }

    // Override withdraw method to prevent withdrawals if balance falls below 100
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount); // Call superclass withdraw method
        } else {
            System.out.println("Cannot withdraw. Minimum balance limit reached!");
        }
    }
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount();

        // Deposit and withdraw money
        savingsAccount.deposit(200);
        savingsAccount.withdraw(50);
        savingsAccount.withdraw(150); // Should fail due to minimum balance limit
        savingsAccount.withdraw(100); // Should succeed

        // Display balance
        System.out.println("Current balance: $" + savingsAccount.getBalance());
    }
}
