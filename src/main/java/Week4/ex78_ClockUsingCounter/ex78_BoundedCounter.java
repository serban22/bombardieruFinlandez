package Week4.ex78_ClockUsingCounter;

import java.util.Scanner;

public class ex78_BoundedCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter seconds = new BoundedCounter(59);

        System.out.print("Seconds: ");
        int s = input.nextInt();
        System.out.print("Minutes: ");
        int m = input.nextInt();
        System.out.print("Hours: ");
        int h = input.nextInt();

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while (i < 10000) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
            i++;
        }
    }
}
