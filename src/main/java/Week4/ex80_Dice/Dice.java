package Week4.ex80_Dice;

import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        return 1 + random.nextInt(numberOfSides);
    }
}
