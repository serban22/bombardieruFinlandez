package Week3;

import java.util.Scanner;

public class ex56_ReversingText {
    public static String reverse(String text) {
        String helper = "";
        int i = text.length() - 1;

        while (i >= 0) {
            helper += text.charAt(i);
            i--;
        }
        return helper;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your text: ");
        String text = input.nextLine();
        System.out.println("Text in reverse: " + reverse(text));
    }
}
