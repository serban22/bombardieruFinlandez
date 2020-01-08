package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class ex68_NumberMoreThanOnceInList {
    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int counter = 0;
        for (int num : list) {
            if (num == number) {
                if (counter > 0) {
                    return true;
                }
                counter++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(10);
        list.add(9);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(input.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }
    }
}
