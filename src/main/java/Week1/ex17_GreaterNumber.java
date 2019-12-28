package Week1;

import java.util.Scanner;

public class ex17_GreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type number a: ");
        int a = input.nextInt();
        System.out.print("Type number b: ");
        int b = input.nextInt();

        if (a < b) {
            System.out.println("Greater number: " + b);
        } else if (a > b) {
            System.out.println("Greater number: " + a);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
