package Week1;

import java.util.Scanner;

public class ex8_Adder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type number a: ");
        int a = input.nextInt();
        System.out.print("Type number b: ");
        int b = input.nextInt();
        System.out.print("The sum of the numbers is: " + (a + b));
    }
}
