package Week3;

import java.util.ArrayList;

public class ex67_Variance {
    public static double variance(ArrayList<Integer> list) {
        double variance = 0;
        double average = average(list);
        for (int number : list) {
            variance += Math.pow(number - average, 2);
        }
        variance /= (list.size() - 1);
        return variance;
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double average = (double) sum(list) / list.size();
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(9);
        list.add(7);
        list.add(21);
        System.out.println("The variance is: " + variance(list));
    }
}
