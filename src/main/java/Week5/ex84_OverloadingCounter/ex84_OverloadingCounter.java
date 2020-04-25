package Week5.ex84_OverloadingCounter;

public class ex84_OverloadingCounter {
    public static void main(String[] args) {
        OverloadingCounter counter = new OverloadingCounter(0, true);
        OverloadingCounter counter1 = new OverloadingCounter(0);
        OverloadingCounter counter2 = new OverloadingCounter(true);
        OverloadingCounter counter3 = new OverloadingCounter();
        counter.increase();
        counter1.increase();
        counter2.increase();
        counter3.increase();
        System.out.println(counter.value() + ", " + counter1.value() + ", " + counter2.value() + ", " + counter3.value());
        counter.increase(6);
        counter1.increase(10);
        counter2.increase(15);
        counter3.increase(17);
        System.out.println(counter.value() + ", " + counter1.value() + ", " + counter2.value() + ", " + counter3.value());
        counter.decrease();
        counter1.decrease();
        counter2.decrease();
        counter3.decrease();
        System.out.println(counter.value() + ", " + counter1.value() + ", " + counter2.value() + ", " + counter3.value());
        counter.decrease(4);
        counter1.decrease(8);
        counter2.decrease(5);
        counter3.decrease(11);
        System.out.println(counter.value() + ", " + counter1.value() + ", " + counter2.value() + ", " + counter3.value());
    }
}
