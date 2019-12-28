package Week1;

import java.util.Scanner;

public class ex19_AgeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = input.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("Your age is reasonable!");
        }
    }
}
