/*
 * This class represents a Banking System.
 * It demonstrates abstraction, encapsulation, interface, and polymorphism.
 */

abstract class BankAccount {

    private int accountNumber;
    protected double balance;

    public BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    abstract double calculateInterest();
}

// Loan interface
interface Loanable {
    boolean applyForLoan();
}

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    double calculateInterest() {
        return balance * 0.04;
    }

    public boolean applyForLoan() {
        return balance > 5000;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        BankAccount account = new SavingsAccount(12345, 10000);

        System.out.println("Interest: " + account.calculateInterest());
        System.out.println("Loan Eligible: " + ((Loanable) account).applyForLoan());
    }
}
