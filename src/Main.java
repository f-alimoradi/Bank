public class Main {
    public static void main(String[] args) {
        TransactionAccount HarryAccount = new TransactionAccount("Harry", "1234", 30);
        TransactionAccount HermioneAccount = new TransactionAccount("Hermione", "9182", 20.5);
        TransactionAccount RonAccount = new TransactionAccount("Ron", "0000", 15.25);

        SavingAccount MinervaAccount = new SavingAccount("4567", "Minerva", 140);
        SavingAccount SeverusAccount = new SavingAccount("3546", "Severus", 175);
        SavingAccount SiriusAccount = new SavingAccount("7266", "Sirius", 210.5);

        BankCustomers bank = new BankCustomers();
        bank.addAccount(HarryAccount);
        bank.addAccount(HermioneAccount);
        bank.addAccount(RonAccount);
        bank.addAccount(MinervaAccount);
        bank.addAccount(SeverusAccount);
        bank.addAccount(SiriusAccount);

        bank.findAccount("1234");
        bank.findAccount("1100");

        System.out.println("Hermione's balance: " + HermioneAccount.getBalance());
        HermioneAccount.deposit(12.5);
        System.out.println("Hermione's balance: " + HermioneAccount.getBalance());

        MinervaAccount.deposit(-20);

        SeverusAccount.calculateInterest();
        System.out.println("Severus's balance: " + SeverusAccount.getBalance());
        RonAccount.calculateInterest();
        System.out.println("Ron's balance: " + RonAccount.getBalance());

        HarryAccount.withdraw(25);
        HermioneAccount.withdraw(100);
        RonAccount.withdraw(-15);

        MinervaAccount.withdraw(225);
        SeverusAccount.withdraw(-0.25);
        SiriusAccount.withdraw(10.5);

        bank.showAllBalances();
    }
}