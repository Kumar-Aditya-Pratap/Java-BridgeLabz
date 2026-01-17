/* This class represents a Bank associated with Customers */
class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer) {
        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }
}
