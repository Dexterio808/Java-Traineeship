package nl.belastingdienst.fundamentals.h7.assignment;

public class Android extends Human implements Chargeable {
    private int level;
    private static final int maxLevel = 100;

    public Android() {
        this(50);
    }

    public Android(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String greet() {
        return "I'm only half human, but human, but human still... My Energy level is " + level + "%.";
    }

    //TODO implement exception
    public int charge(int amount) {
        if (level + amount <= maxLevel) {
            level += amount;
        }
        return level;
    }



}
