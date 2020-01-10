package Week4.ex82_Lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        int i = 0;
        int randomNumber;
        while (i < 7) {
            randomNumber = 1 + random.nextInt(39);
            if (!containsNumber(randomNumber)) {
                numbers.add(randomNumber);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
