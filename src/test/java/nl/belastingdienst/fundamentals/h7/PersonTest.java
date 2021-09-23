package nl.belastingdienst.fundamentals.h7;

import nl.belastingdienst.fundamentals.h7.assignment.Person;
import nl.belastingdienst.fundamentals.h7.assignment.PersonDiedException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PersonTest {
    @Test
    public void testPersonWithNormalAge() throws PersonDiedException {
        Person p = new Person("Jan", 45);
        p.haveBirthday();
        assertEquals(46, p.getAge());
    }

    @Test
    public void testPersonWithAgeOnLimit() throws PersonDiedException {
        Person t = new Person("Chris", 129);
        t.haveBirthday();
        assertEquals(130, t.getAge());
    }

    @Test(expected = PersonDiedException.class)
    public void testPersonOverAgeLimit() throws PersonDiedException {
        Person z = new Person("Truus", 130);
        z.haveBirthday();
    }

    @Test
    public void testSystemGC() throws InterruptedException {
        Person testPerson = new Person();
        System.out.println("cp1");
        testPerson = null;
        Thread.sleep(1_000);
        System.out.println("cp2");
        System.gc();
        Thread.sleep(1_000);
        System.out.println("cp3");
        Thread.sleep(1_000);
    }

    @Test
    public void testAddHistory(){
        Person p = new Person();
        p.addHistory("descr1");
        p.printHistory();
    }

    @Test
    public void testSubHuman(){
        Person p = new Person();
        p.createSubHuman();
    }


}