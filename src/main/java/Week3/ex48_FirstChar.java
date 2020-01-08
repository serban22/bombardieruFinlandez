package Week3;

import java.util.Scanner;

public class ex48_FirstChar {
    public static char firstCharacter(String text) {
        char firstChar = text.charAt(0);
        return firstChar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();
        System.out.println("First character of the name: " + firstCharacter(name));
    }
}
