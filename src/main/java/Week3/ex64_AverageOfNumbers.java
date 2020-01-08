package Week3;

import java.util.ArrayList;

public class ex64_AverageOfNumbers {
    public static double average(ArrayList<Integer> list) {
        return (double) sum(list) / list.size();
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(6);
        list.add(8);
        list.add(13);

        System.out.println("The average: " + average(list));
    }
}
