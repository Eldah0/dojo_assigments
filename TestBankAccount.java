
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000, 500);
        BankAccount account2 = new BankAccount(2000, 1000);

        System.out.println("Account 1 - Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Account 1 - Savings Balance: " + account1.getSavingsBalance());
        System.out.println("Account 2 - Checking Balance: " + account2.getCheckingBalance());
        System.out.println("Account 2 - Savings Balance: " + account2.getSavingsBalance());

        account1.deposit(200, "checking");
        account2.deposit(300, "savings");

        account1.withdraw(150, "checking");
        account2.withdraw(2000, "savings");

        System.out.println("Total money in all accounts: " + BankAccount.getTotalMoney());
    }
}
