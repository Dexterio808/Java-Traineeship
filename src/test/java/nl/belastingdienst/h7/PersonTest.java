package nl.belastingdienst.h7;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

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



}