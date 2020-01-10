package Week4;

import java.util.ArrayList;

public class ex70_CombiningArrayLists {
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);
        //or Collections.addAll(list1, 4, 3);

        list2.add(5);
        list2.add(10);
        list2.add(7);
        //or Collections.addAll(list2, 5, 10, 7);

        combine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
