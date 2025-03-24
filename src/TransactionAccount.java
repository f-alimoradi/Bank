public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountHolderName, String accountNumber, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }
    @Override
    public void calculateInterest() {
        System.out.println("There's no interest on this account.");
        System.out.println();
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overDraftLimit) {
            balance -= amount;
            System.out.println("account number: " + getAccountNumber());
            System.out.println("amount: " + amount);
            System.out.println();
        } else {
            System.out.println("invalid amount!");
            System.out.println();
        }
    }
}
