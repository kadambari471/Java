// Define the BankAccount interface with deposit and withdraw methods
package labpack;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

// CheckingAccount class implements the BankAccount interface
class CheckingAccount implements BankAccount {
    private double balance; // Balance of the account

    // Constructor to initialize balance to 0.0
    public CheckingAccount() {
        this.balance = 0.0;
    }

    // Implement the deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Add amount to balance
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    // Implement the withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Subtract amount from balance
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal");
        } else {
            System.out.println("Withdrawal amount must be positive");
        }
    }

    // Getter method to return the current balance
    public double getBalance() {
        return balance;
    }
}

// Main class to test the CheckingAccount functionality
public class Bank {
    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount(); // Create a CheckingAccount object

        myAccount.deposit(1000.00);   // Deposit $1000.00
        myAccount.withdraw(250.00);  // Withdraw $250.00
        myAccount.withdraw(800.00);  // Attempt to withdraw $800.00 (should fail due to insufficient funds)
        myAccount.withdraw(50.00);   // Withdraw $50.00
    }
}
