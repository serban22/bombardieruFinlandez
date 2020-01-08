package Week3;

import java.util.Scanner;

public class ex52_ReversingAName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();

        System.out.print("Name in reverse: ");
        int i = name.length() - 1;
        while (i >= 0) {
            System.out.print(name.charAt(i));
            i--;
        }
    }
}
