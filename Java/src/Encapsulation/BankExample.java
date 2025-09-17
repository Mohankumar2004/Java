package Encapsulation;

class BankAccount {
    // Private data members (hidden from outside)
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}

public class BankExample {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("Mohan", 5000);

        // Access balance safely
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());

        // Perform operations
        account.deposit(2000);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(1500);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Invalid cases
        account.deposit(-500);    // Not allowed
        account.withdraw(10000);  // Not enough balance
    }
}
