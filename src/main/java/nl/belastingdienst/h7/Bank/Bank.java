package nl.belastingdienst.h7.Bank;


import java.util.ArrayList;

public class Bank {



    public static void bankDemo(){
        Account acc1 = new Account("100", 500, 1.25);
        Account acc2 = new Account("150", 300, 1.30);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);
        Account.setAccounts(accounts);


        acc1.transferMoney(acc2, 300);
        acc1.transferMoney(acc2, 300);

        Account.interestTime();
        Account.bankGold();
    }
}
