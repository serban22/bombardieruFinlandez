package Week3;

import java.util.Scanner;

public class ex69_Palindrome {
    public static boolean palindrome(String text) {
        if (text.equalsIgnoreCase(reverse(text))) {
            return true;
        }
        return false;
    }

    public static String reverse(String text) {
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type text: ");
        String text = input.nextLine();

        if (palindrome(text)) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
    }
}
