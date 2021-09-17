package nl.belastingdienst.h7.assignment;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    public static final String universalRights = "All humans are created equal";
    public static final int maxAge = 130;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age) {
        this(name, age, Gender.UNKNOWN);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static String universalRights() {
        return universalRights;
    }

    public void haveBirthday() throws PersonDiedException {
        checkDeath(getAge());
    }

    public void checkDeath(int age) throws PersonDiedException {
        if (age < maxAge) {
            setAge(getAge() + 1);
        } else {
            throw new PersonDiedException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
