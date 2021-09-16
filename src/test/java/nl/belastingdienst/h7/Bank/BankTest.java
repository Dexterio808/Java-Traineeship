package nl.belastingdienst.h7.Bank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BankTest {
    private Bank target;

    @Before
    public void setUp() throws Exception {
        target = new Bank();
    }


    @Test
    public void bankGold() {

        Account account = mock(Account.class);


        assertEquals(20 ,target.bankGold());
    }

}