public abstract class BankAccount {
    private final String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public abstract void calculateInterest();
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("account number: " + accountNumber);
            System.out.println("amount: " + amount);
            System.out.println();
        }
        else {
            System.out.println("invalid amount!");
            System.out.println();
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("account number: " + accountNumber);
            System.out.println("amount: " + amount);
            System.out.println();
        }
        else {
            System.out.println("invalid amount!");
            System.out.println();
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
}
