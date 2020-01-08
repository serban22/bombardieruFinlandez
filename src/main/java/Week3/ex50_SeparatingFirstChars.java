package Week3;

import java.util.Scanner;

public class ex50_SeparatingFirstChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Type your name: ");
        name = input.nextLine();

        if (name.length() >= 3) {
            System.out.println("1. character: " + name.charAt(0));
            System.out.println("2. character: " + name.charAt(1));
            System.out.println("3. character: " + name.charAt(2));
        }
    }
}
