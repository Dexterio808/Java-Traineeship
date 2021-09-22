package nl.belastingdienst.h7.assignment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AndroidTest {


    @Test
    public void testGreet(){
        Android twoB = new Android();
        System.out.println(twoB.greet());
        assertEquals("I'm only half human, but human, but human still... My Energy level is 50%.", twoB.greet());
    }

    @Test
    public void testChargeNormal(){
        Android twoB = new Android();
        twoB.charge(25);
        assertEquals(75 ,twoB.getLevel());
    }

    @Test
    public void testChargeLimit(){
        Android twoB = new Android();
        twoB.charge(50);
        assertEquals(100 ,twoB.getLevel());
    }

    @Test
    public void testChargeOverLimit(){
        Android twoB = new Android();
        twoB.charge(51);
        assertEquals(50 ,twoB.getLevel());
    }

}