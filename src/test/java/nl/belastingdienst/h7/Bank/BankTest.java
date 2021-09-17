package nl.belastingdienst.h7.Bank;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BankTest {
    private Bank target;

    @Before
    public void setUp() throws Exception {
        target = new Bank("test bank");
    }


    @Test
    public void bankGold() {
        Account account1 = mock(Account.class);
        Account account2 = mock(Account.class);
        Account account3 = mock(Account.class);

        target.addAccount(account1);
        target.addAccount(account2);
        target.addAccount(account3);

        when(account1.getBalance()).thenReturn(150d);
        when(account2.getBalance()).thenReturn(50d);
        when(account3.getBalance()).thenReturn(150_000d);

        double bankGold = target.bankGold();

        assertEquals(150200d, bankGold, 0.1d);
    }

    @Test
    public void interestTime() {
        ArrayList<Account> accounts = new ArrayList<>();

        Account account1 = mock(Account.class);
        Account account2 = mock(Account.class);
        Account account3 = mock(Account.class);

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        for (int i = 0; i < 3; i++) {
            when(account1.getBalance()).thenReturn(150d);
            when(account2.getBalance()).thenReturn(200d);
            when(account3.getBalance()).thenReturn(500d);

            when(account1.getInterestRate()).thenReturn(1.05d);
            when(account2.getInterestRate()).thenReturn(1.25d);
            when(account3.getInterestRate()).thenReturn(1.46d);

            //assertEquals( 157.5d ,account1.getBalance());



        }

    }


}