package Week3;

import java.util.Scanner;

public class ex49_LastChar {
    public static char lastCharacter(String text) {
        char lastChar = text.charAt(text.length() - 1);
        return lastChar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();
        System.out.println("Last character: " + lastCharacter(name));
    }
}
