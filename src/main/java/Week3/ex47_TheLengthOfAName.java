package Week3;

import java.util.Scanner;

public class ex47_TheLengthOfAName {
    public static int calculateCharacters(String text) {
        int length = text.length();
        return length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();
        System.out.println("Number of characters: " + calculateCharacters(name));
    }
}
