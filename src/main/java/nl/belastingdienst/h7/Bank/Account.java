package nl.belastingdienst.h7.Bank;

import java.util.ArrayList;

public class Account {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private String accountNumber;
    private double balance;
    private double interestRate;

    public Account(String accountNumber, int balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public static ArrayList<Account> getAccounts() {
        return accounts;
    }

    public static void setAccounts(ArrayList<Account> accounts) {
        Account.accounts = accounts;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public  void withdraw(double amount) throws NotEnoughGoldException{
        if (amount <= this.getBalance()) {
            this.setBalance(this.getBalance() - amount);
        } else {
            double goldShort = amount - this.getBalance();
            throw new NotEnoughGoldException(goldShort);
        }
    }

    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }


    public void transferMoney(Account account, double amount){
        try{
            withdraw(amount);
            account.deposit(amount);
            System.out.println("Transfer successful");
            System.out.println("New balance: " + getBalance());

        } catch(NotEnoughGoldException e){
            System.out.println("Your balance is to low");
            System.out.println("Your balance: " + getBalance());
            System.out.println("Transfer amount: " + amount);
            System.out.println("Needed balance for transfer: " + e.getAmount());
        }
    }

    public void returnInterest(){
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Balance before interest:" + getBalance());
        double interest = (getBalance()* (getInterestRate()/100));
        setBalance(getBalance() + interest);
        System.out.println("Balance after interest:" + getBalance());
    }

    public static void bankGold(){
        double bankBalance = 0;
        for (Account account : accounts) {
            bankBalance += account.getBalance();
        }
        System.out.println("Total bank balance is: " + bankBalance);
    }

    public static void interestTime(){
        for (Account account : accounts) {
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Balance before interest:" + account.getBalance());
            double interest = (account.getBalance()* (account.getInterestRate()/100));
            account.setBalance(account.getBalance() + interest);
            System.out.println("Balance after interest:" + account.getBalance());
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
