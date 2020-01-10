package Week4.ex75_DecreasingCounter;

public class ex75_DecreasingCounter {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.setInitial();
        counter.printValue();

        counter.decrease();
        counter.decrease();
        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
