package Week1;

import java.util.Scanner;

public class ex11_BiggerNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type number a: ");
        int a = input.nextInt();
        System.out.print("Type number b: ");
        int b = input.nextInt();
        System.out.print("The bigger number is: " + Math.max(a, b));
    }
}
