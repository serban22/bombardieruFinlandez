package Week4.ex75_DecreasingCounter;

public class DecreasingCounter {
    private int value;
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("Value: " + this.value);
    }

    public void decrease() {
        if (value > 0) {
            value--;
        }
    }

    public void reset() {
        value = 0;
    }

    public void setInitial() {
        this.value = initialValue;
    }
}
