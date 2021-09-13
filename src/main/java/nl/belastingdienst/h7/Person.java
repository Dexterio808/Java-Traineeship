package nl.belastingdienst.h7;

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

    public  void haveBirthday()  {
        try{
            checkDeath(getAge());
        } catch(PersonDiedException e) {
            System.out.println("Person has died");
        }
    }

    public void checkDeath(int age) throws PersonDiedException {
        if (age < maxAge) {
            setAge(getAge() + 1);
        } else {
            throw new PersonDiedException();
        }
    }

}
