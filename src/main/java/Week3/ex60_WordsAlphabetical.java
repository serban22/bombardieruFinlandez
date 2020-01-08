package Week3;

import java.util.*;

public class ex60_WordsAlphabetical {
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

        Collections.sort(words);
        System.out.println("The words that you typed, but in alphabetical order:");
        for (String typedWords : words) {
            System.out.println(typedWords);
        }
    }
}
