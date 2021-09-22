package nl.belastingdienst.h7.Bank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    // netjes.

    @Test
    public void testWithdrawNormal() throws NotEnoughGoldException {
        Account account = new Account("123", 15000d, 1.45d); // DRY
        account.withdraw(7500d);
        assertEquals(7500.0, account.getBalance(), 0.01d);
    }

    @Test(expected = NotEnoughGoldException.class)
    public void testWithdrawWithToLowBalance() throws NotEnoughGoldException {
        Account account = new Account("123", 15000d, 1.45d);
        account.withdraw(20000d);

    }

    @Test
    public void testDeposit() {
        Account account = new Account("123", 15000d, 1.45d);
        account.deposit(480.65);
        assertEquals(15480.65, account.getBalance(), 0.01);
    }

    @Test
    public void testReturnInterest() {
        Account account = new Account("123", 15000d, 1.45d);
        account.returnInterest();
        assertEquals(15217.5d, account.getBalance(), 0.01d);
    }

}
