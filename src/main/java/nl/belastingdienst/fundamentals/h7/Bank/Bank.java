package nl.belastingdienst.fundamentals.h7.Bank;


import java.util.ArrayList;

public class Bank {
    private int id = 1000;
    private ArrayList<Account> accounts;

    public Bank() {

    }

    public enum AccountType {CHECKING, SAVING}

    public Account createAccount(AccountType accountType) {
        switch (accountType) {
            case CHECKING:
                return new CheckingAccount(id++);
            case SAVING:
                return new SavingAccount(id++);
            default:
                return null;
        }
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    double bankBalance(){
        double bankBalance = 0;
        for (Account account : accounts) {
            bankBalance += account.getBalance();
        }
        return bankBalance;
    }

    void interestForAllBankAccounts(){
        for (Account account : accounts) {
            System.out.println("Account: " + account.id);
            if (account instanceof SavingAccount){
                SavingAccount tempSA = (SavingAccount) account;
                System.out.println("Interest: " + tempSA.calculateInterest());
            }
        }
    }

    void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    boolean withdraw(Account account, double amount) throws NotEnoughBalanceException {
        return account.withdraw(amount);
    }

    boolean transferMoney(Account account1, Account account2, double amount) throws NotEnoughBalanceException {
        this.withdraw(account1, amount);
        this.deposit(account2, amount);
        return true;
    }

    

    abstract class Account {
        private int id;
        private double balance;

        public Account(int id) {
            this(id, 00d);
        }
        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
        }

        public void deposit(double amount){
            balance += amount;
        }

        public boolean withdraw(double amount) throws NotEnoughBalanceException {
            if (getBalance() >= amount){
                setBalance(getBalance() - amount);
                return true;
            }
            throw new NotEnoughBalanceException("Cannot withdraw " + amount + " from this account.");
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }

    class CheckingAccount extends Account {

        public CheckingAccount(int id) {
            super(id, 00d);
        }

        public CheckingAccount(int id, double balance) {
            super(id, balance);
        }
    }

    class SavingAccount extends Account {
        private double interestRate;

        public SavingAccount(int id) {
            super(id, 00d);
        }

        public SavingAccount(int id, double balance) {
            super(id, balance);
        }

        public SavingAccount(int id, double balance, double interest) {
            super(id, balance);
            this.interestRate = interest;
        }

        //calculate interest, then return amount
        double calculateInterest(){
            return getBalance() * getInterestRate();
        }

        //apply interest and return new balance
        double applyInterest(){
            setBalance(getBalance() + calculateInterest());
            return getBalance();
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }
    }
}









/*

public class Bank {

    private String bankName;
    private String bankAccountNumber;
    private int id = 1000;
    private ArrayList<Account> accounts = new ArrayList<>();

    //TODO change bankAccountNumber int
    public Bank(String bankName) {
        this(bankName, null, null);
    }

    public Bank(String bankName, String bankAccountNumber, ArrayList<Account> accounts) {
        this.bankName = bankName;
        this.bankAccountNumber = bankAccountNumber;
        this.accounts = accounts;
    }

    public enum AccountType{CHECKING, SAVING}

    public Account createAccount(AccountType accountType){
        switch (accountType) {
            case CHECKING:
                return new CheckingAccount(id++);
            case SAVING:
                return new SavingAccount(id++);
            default:
                return null;
        }
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

*/
/*    public void interestTime() {
        for (Account account : accounts) {
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Balance before interest:" + account.getBalance());
            double interest = (account.getBalance() * (account.getInterestRate() / 100));
            account.setBalance(account.getBalance() + interest);
            System.out.println("Balance after interest:" + account.getBalance());
        }
    }*//*


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

    public abstract class Account {

        private int accountNumber;
        private double balance;


        public Account(int accountNumber) {
            this(accountNumber, 0d);
        }

        public Account(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

//        public double getInterestRate() {
//            return interestRate;
//        }

        void withdraw(double amount) throws NotEnoughGoldException {
            if (amount <= this.getBalance()) {
                this.setBalance(this.getBalance() - amount);
            } else {
                double goldShort = amount - this.getBalance();
                throw new NotEnoughGoldException(goldShort);
            }
        }

        void deposit(double amount) {
            this.setBalance(this.getBalance() + amount);
        }

        void returnInterest() {
            System.out.println("Account number: " + getAccountNumber());
            System.out.println("Balance before interest:" + getBalance());
            double interest = (getBalance() * (getInterestRate() / 100));
            setBalance(getBalance() + interest);
            System.out.println("Balance after interest:" + getBalance());
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

    private class CheckingAccount extends Account{

        public CheckingAccount(int accountNumber) {
            super(accountNumber);
        }
    }

    private class SavingAccount extends Account{
        private double interestRate;

        public SavingAccount(int accountNumber) {
            super(accountNumber);
            this.interestRate = 1.00d;
        }

        public SavingAccount(int accountNumber, double balance , double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }
    }
}
*/
