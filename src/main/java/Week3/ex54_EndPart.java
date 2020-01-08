package Week3;

import java.util.Scanner;

public class ex54_EndPart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = input.nextLine();
        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(input.nextLine());
        System.out.println("Result: " + word.substring(word.length() - length));
    }
}
