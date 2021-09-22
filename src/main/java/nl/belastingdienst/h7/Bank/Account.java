package nl.belastingdienst.h7.Bank;

public class Account {

    private String accountNumber;
    private double balance;
    private double interestRate;

    // unused
    public Account(String accountNumber) {
        this(accountNumber, 0d, 0d);
    }

    public Account(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // getters/setters zetten we meestal onderaan in de class.
    public String getAccountNumber() {
        return accountNumber;
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

    // package private?
    void withdraw(double amount) throws NotEnoughGoldException {
        if (amount <= this.getBalance()) {
            this.setBalance(this.getBalance() - amount); // methods hoef je niet te prefixen met this.
        } else {
            double goldShort = amount - this.getBalance();
            throw new NotEnoughGoldException(goldShort);
        }
    }

    void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    void returnInterest() { // returnt niets, maar heet wel zo; kan verwarrend zijn
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
