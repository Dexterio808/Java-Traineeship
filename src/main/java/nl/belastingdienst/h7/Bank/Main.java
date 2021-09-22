package nl.belastingdienst.h7.Bank;

public class Main {

    // deze main is niet op te starten. weet jij waarom?
    public static void main(){
        Bank b = new Bank("test bank");
        Account acc1 = new Account("100", 500, 1.25);
        Account acc2 = new Account("150", 300, 1.30);


        b.addAccount(acc1);
        b.addAccount(acc2);

        b.transferMoney(acc1, acc2, 300);
        b.transferMoney(acc2, acc2, 300);

        b.interestTime();
        b.bankGold();

    }
}
