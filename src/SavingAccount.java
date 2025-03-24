public class SavingAccount extends BankAccount{
    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }
    @Override
    public void calculateInterest() {
        deposit(interestRate * balance);
        System.out.println("saving account");
        System.out.println("interest:" + interestRate * balance);
        System.out.println();
    }
}
