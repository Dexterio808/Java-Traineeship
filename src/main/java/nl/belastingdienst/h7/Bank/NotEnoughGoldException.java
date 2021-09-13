package nl.belastingdienst.h7.Bank;

public class NotEnoughGoldException extends Exception{
    private double amount;

    public  NotEnoughGoldException(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
