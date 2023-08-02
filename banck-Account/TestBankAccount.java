public class TestBankAccount {
    public static void main(String[] args) {
        // Create a new BankAccount instance
        BankAccount account1 = new BankAccount(0, 0);

        // Deposit some money to checking and savings accounts
        account1.deposit(1000, "checking");
        account1.deposit(2000, "savings");

        // Check balances
        System.out.println("Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Savings Balance: " + account1.getSavingsBalance());

        // Withdraw some money from checking and savings accounts
        account1.withdraw(500, "checking");
        account1.withdraw(1000, "savings");

        // Check balances after withdrawals
        System.out.println("Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Savings Balance: " + account1.getSavingsBalance());

        // Check total amount
        System.out.println("Total Amount in both accounts: " + account1.totalAmount());

        // Create another BankAccount instance
        BankAccount account2 = new BankAccount(500, 1000);

        // Check total number of accounts and total balance
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        System.out.println("Total Balance in all accounts: " + BankAccount.getTotalBalance());
    }
}
