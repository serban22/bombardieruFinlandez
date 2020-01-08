package Week3;

import java.util.Scanner;

public class ex51_SeparatingChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();

        int i = 0;
        while (i < name.length()) {
            System.out.println(i + 1 + ". character: " + name.charAt(i));
            i++;
        }
    }
}
