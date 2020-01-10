package Week4;

import java.util.ArrayList;
import java.util.Collections;

public class ex71_SmartCombining {
    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (int i : second) {
            if (!first.contains(i)) {
                first.add(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);
        Collections.addAll(list2, 5, 10, 7);

        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
