package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class ex58_RecurringWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type the desired word: ");
        String word = input.nextLine();

        while (!words.contains(word)) {
            words.add(word);
            System.out.print("Type the desired word: ");
            word = input.nextLine();
        }
        System.out.println("You gave the word " + word + " twice.");

    }
}
