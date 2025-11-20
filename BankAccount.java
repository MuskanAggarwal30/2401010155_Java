class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class BankAccount {
    private double balance;
    public BankAccount() {
        this.balance = 0.0;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal of: " + amount);
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(1000.0);
        System.out.println("Balance after deposit: " + account.getBalance());
        try {
            account.withdraw(500.0);
            System.out.println("Balance after withdrawal: " + account.getBalance());
            account.withdraw(600.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Final Balance: " + account.getBalance());
    }
}
