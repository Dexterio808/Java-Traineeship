package nl.belastingdienst.h7.Bank;

public class Main {

    public static void main(){
        Bank b = new Bank();
        Account acc1 = new Account("100", 500, 1.25);
        Account acc2 = new Account("150", 300, 1.30);


        b.addAccount(acc1);
        b.addAccount(acc2);

        try {
            b.transferMoney(acc1, acc2, 300);
            b.transferMoney(acc2, acc2, 300);

            b.interestTime();
            b.bankGold();

        } catch(NotEnoughGoldException e) {
            e.printStackTrace();
        }
    }
}
