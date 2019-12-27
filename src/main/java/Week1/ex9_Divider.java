package Week1;

import java.util.Scanner;

public class ex9_Divider {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type number a: ");
        double a = input.nextInt();
        System.out.print("Type number b: ");
        double b = input.nextInt();
        double quotient = a / b;
        System.out.print("The quotient of a and b is: " + quotient);
    }
}
