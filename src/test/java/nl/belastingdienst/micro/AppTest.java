package nl.belastingdienst.micro;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AppTest {
    private App target;
    private List<Card> cards;
    private Scanner mockScanner;

    @Before
    public void setUp() throws Exception {
        RegularCard card1 = new RegularCard(1235, "Geralda", 1000);
        GoldCard card2 = new GoldCard(1236, "Donald", 7000, 10);
        RegularCard card3 = new RegularCard(1237, "Edward", 5000);
        GoldCard card4 = new GoldCard(1238, "Mona", 7000, 10);
        GoldCard card5 = new GoldCard(1239, "Roan", 800, 15);
        RegularCard card6 = new RegularCard(1240, "Vera", 500);

        target = new App();
        target.addCard(card1);
        target.addCard(card2);
        target.addCard(card3);
        target.addCard(card4);
        target.addCard(card5);
        target.addCard(card6);

        mockScanner = mock(Scanner.class);
        target.setScanner(mockScanner);
    }

    @Test
    public void testApp(){
        when(mockScanner.nextInt())
                .thenReturn(1237)
                .thenReturn(200);
        target.startApp();
    }

    @Test (expected = PaymentFailedException.class)
    public void testAppFailPay(){
        when(mockScanner.nextInt())
                .thenReturn(1237)
                .thenReturn(40000)
                .thenReturn(1237)
                .thenReturn(200);
        target.startApp();
    }
}