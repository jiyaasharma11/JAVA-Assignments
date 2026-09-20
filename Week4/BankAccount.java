class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        balance = 0;
    }

    public Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return accountNumber + " - " + ownerName + " - Balance: " + balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account a1 = new Account("A001", "Alice");
        Account a2 = new Account("A002", "Bob", 500);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println("Deposit 100: " + a1.deposit(100));
        System.out.println("Deposit 0: " + a1.deposit(0));
        System.out.println("Deposit -50: " + a1.deposit(-50));

        System.out.println("Withdraw 50: " + a1.withdraw(50));
        System.out.println("Withdraw 1000: " + a1.withdraw(1000));

        System.out.println(a1);
        System.out.println(a2);
    }
}