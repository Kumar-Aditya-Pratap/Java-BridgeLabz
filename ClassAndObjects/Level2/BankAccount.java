/*
 This class simulates a Bank Account.
 It allows deposit, withdrawal, and balance display.
*/
class BankAccount {

    private String accountHolder; // account holder name
    private int accountNumber; // account number
    private double balance; // current balance

    BankAccount(String name, int number, double balance) { // constructor
        this.accountHolder = name;
        this.accountNumber = number;
        this.balance = balance;
    }

    void deposit(double amount) { // adds money to balance
        balance += amount;
    }

    void withdraw(double amount) { // withdraws money if balance is sufficient
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void displayBalance() { // displays current balance
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ravi", 123, 5000); // creating account
        acc.withdraw(1000); // withdrawing money
        acc.displayBalance(); // showing balance
    }
}
