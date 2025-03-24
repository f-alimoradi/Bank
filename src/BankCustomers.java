import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }
    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println("account holder name: " + account.getAccountHolderName());
            System.out.println("account number: " + account.getAccountNumber());
            System.out.println("balance: " + account.getBalance());
            System.out.println();
        }
    }
    public BankAccount findAccount(String accountNumber) {
        try {
            for (int i = 0; accountsList.get(i) != null; i++) {
                if (accountsList.get(i).getAccountNumber().equals(accountNumber)) {
                    System.out.println("account holder name: " + accountsList.get(i).getAccountHolderName());
                    System.out.println("account number: " + accountsList.get(i).getAccountNumber());
                    System.out.println("balance: " + accountsList.get(i).getBalance());
                    System.out.println();
                    return accountsList.get(i);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("this account doesn't exist in the account list!");
            System.out.println();
        }
        return  null;
    }
}
