package nl.belastingdienst.fundamentals.h7.Bank;

public class NotEnoughBalanceException extends Exception{
    private double amount;

    public NotEnoughBalanceException(String s) {
        super(s);
    }

    public NotEnoughBalanceException(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
