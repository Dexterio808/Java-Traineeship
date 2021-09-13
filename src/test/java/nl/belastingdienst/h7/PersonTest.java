package nl.belastingdienst.h7;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testPerson() {
        Person p = new Person("Jan", 130);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        //p.haveBirthday(); // person gets one year older
        System.out.println(p.getAge());
        System.out.println(Person.universalRights);
    }

}