package edu.eiu.fruit;

public class Pear implements IFruit {
    public static final String NAME = "Pear";
    public static final int ROLL_MULTIPLIER = 0;

    public String getName() {
        return NAME;
    }

    public int getRollMultiplier() {
        return ROLL_MULTIPLIER;
    }
}
