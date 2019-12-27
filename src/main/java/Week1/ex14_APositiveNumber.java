package Week1;

import java.util.Scanner;

public class ex14_APositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type the number: ");
        int a = input.nextInt();

        if (a > 0) {
            System.out.println("Your number is positive!");
        } else if (a == 0) {
            System.out.println("Your number is null!");
        } else {
            System.out.println("Your number is negative!");
        }

    }
}
