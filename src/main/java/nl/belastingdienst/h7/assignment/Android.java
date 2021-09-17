package nl.belastingdienst.h7.assignment;

public class Android extends Human implements Chargeable {
    int level;
    static final int maxLevel = 100;

    public Android() {
        this(50);
    }

    public Android(int level) {
        this.level = level;
    }

    String greet() {
        return "I'm only half human, but human, but human still... My Energy level is " + level + "%.";

    }

    public int charge(int amount) {
        if (level + amount <= maxLevel) {
            level += amount;
        }
        return level;
    }



}
