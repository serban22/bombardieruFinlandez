package Week1;

import java.util.Scanner;

public class ex15_AgeOfMajority {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You have reached the age of majority!");
        } else {
            System.out.println("You have not reached the age of majority!");
        }
    }
}
