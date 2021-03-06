package nl.belastingdienst.fundamentals.h1;

public class Trainee {
    private String firstName;
    private String lastName;

    public Trainee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printFullName(){
        System.out.println(this.firstName + " " + this.lastName);
    }
}
