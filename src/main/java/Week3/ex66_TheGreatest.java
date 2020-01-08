package Week3;

import java.util.ArrayList;

public class ex66_TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        int greatest = list.get(0);
        for (int number : list) {
            if (number > greatest) {
                greatest = number;
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(7);
        list.add(14);
        list.add(20);

        System.out.println("The greatest number is: " + greatest(list));
    }
}
