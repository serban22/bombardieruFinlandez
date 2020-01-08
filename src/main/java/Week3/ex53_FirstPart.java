package Week3;

import java.util.Scanner;

public class ex53_FirstPart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = input.nextLine();
        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(input.nextLine());
        System.out.println("Result: " + word.substring(0, length));
    }
}
