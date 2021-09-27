package nl.belastingdienst.fundamentals.micro;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    //Test pay() with Card
    @Test
    public void testPayNormal(){
        Card card = new Card(1,50d);
        assertTrue(card.pay(25));
    }

    @Test
    public void testPayLimit(){
        Card card = new Card(1,50d);
        assertTrue(card.pay(50));
    }

    @Ignore
    @Test
    public void testPayOverLimit(){
        Card card = new Card(1,50d);
        assertFalse(card.pay(51));
    }

    //Test pay() with Regular card
    @Test
    public void testRegularPayNormal(){
        RegularCard card = new RegularCard(1,50d);
        assertTrue(card.pay(25));
    }

    @Test
    public void testRegularPayLimit(){
        RegularCard card = new RegularCard(1,50d);
        assertTrue(card.pay(50));
    }

    @Ignore
    @Test
    public void testRegularPayOverLimit(){
        RegularCard card = new RegularCard(1,50d);
        assertFalse(card.pay(51));
    }

    //Test pay() with Gold card
    @Test
    public void testGoldPayNormal(){
        GoldCard card = new GoldCard(1,50d, 5);
        assertTrue(card.pay(25));
    }

    @Test
    public void testGoldPayLimit(){
        GoldCard card = new GoldCard(1,50d, 5);
        assertTrue(card.pay(55));
    }

    @Test
    public void testGoldPayOverLimit(){
        GoldCard card = new GoldCard(1,50d, 5);
        assertTrue(card.pay(56));
    }


}