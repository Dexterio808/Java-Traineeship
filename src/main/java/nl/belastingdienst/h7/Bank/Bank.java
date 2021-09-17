package nl.belastingdienst.h7.Bank;


import java.util.ArrayList;

public class Bank {

    private String bankName;
    private String bankAccountNumber;

    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank(String bankName) {
        this(bankName, null, null);
    }

    public Bank(String bankName, String bankAccountNumber, ArrayList<Account> accounts) {
        this.bankName = bankName;
        this.bankAccountNumber = bankAccountNumber;
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void transferMoney(Account account1, Account account2, double amount) {
        this.withdraw(account1, amount);
        this.deposit(account2, amount);
        System.out.println("Transfer successful");
        System.out.println("New balance: " + account1.getAccountNumber() + " : " + account1.getBalance());
    }

    public double bankGold() {
        double bankBalance = 0;
        for (Account account : accounts) {
            bankBalance += account.getBalance();
        }
        System.out.println("Total bank balance is: " + bankBalance);
        return bankBalance;
    }

    public void interestTime() {
        for (Account account : accounts) {
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Balance before interest:" + account.getBalance());
            double interest = (account.getBalance() * (account.getInterestRate() / 100));
            account.setBalance(account.getBalance() + interest);
            System.out.println("Balance after interest:" + account.getBalance());
        }
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        try {
            account.withdraw(amount);
        } catch (NotEnoughGoldException e) {
            System.out.println("Sorry guest your balance is too low, you need : " + e.getAmount() + " more balance.");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }
}
