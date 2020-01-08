package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class ex57_Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type the desired word: ");
        String word = input.nextLine();

        while (!word.isEmpty()) {
            words.add(word);
            System.out.print("Type the desired word: ");
            word = input.nextLine();
        }

        System.out.println("You typed the following words:");
        for (String typedWords : words) {
            System.out.println(typedWords);
        }
    }
}
