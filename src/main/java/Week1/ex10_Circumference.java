package Week1;

import java.util.Scanner;

public class ex10_Circumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type the radius: ");
        double radius = input.nextInt();
        double pi = Math.PI * 2;
        double circumference = pi * radius;
        System.out.print("The circumference is: " + circumference);
    }
}
