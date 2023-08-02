import java.util.Random;

class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int totalAccounts = 0;
    private static double totalBalance = 0;
    private String accountNumber;

    // Constructor
    public BankAccount(double initialCheckingBalance, double initialSavingsBalance) {
        this.checkingBalance = initialCheckingBalance;
        this.savingsBalance = initialSavingsBalance;
        this.accountNumber = generateAccountNumber();

        totalAccounts++;
        totalBalance += initialCheckingBalance + initialSavingsBalance;
    }

    // Getter methods
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Method to deposit money into either checking or savings
    public void deposit(double amount, String accountType) {
        if (accountType.equals("checking")) {
            checkingBalance += amount;
        } else if (accountType.equals("savings")) {
            savingsBalance += amount;
        }

        totalBalance += amount;
    }

    // Method to withdraw money from either checking or savings
    public void withdraw(double amount, String accountType) {
        if (accountType.equals("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalBalance -= amount;
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equals("savings")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalBalance -= amount;
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        }
    }

    // Method to see the total money from checking and savings
    public double totalAmount() {
        return checkingBalance + savingsBalance;
    }

    // Private method to generate a random ten-digit account number
    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    // Static methods to get total accounts and total balance
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static double getTotalBalance() {
        return totalBalance;
    }
}

