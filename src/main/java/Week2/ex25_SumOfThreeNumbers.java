package Week2;

import java.util.Scanner;

public class ex25_SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.print("Type the first number: ");
        read = input.nextInt();
        sum = sum + read;
        System.out.print("Type the second number: ");
        read = input.nextInt();
        sum = sum + read;
        System.out.print("Type the third number: ");
        read = input.nextInt();
        sum = sum + read;

        System.out.println("Sum: " + sum);

    }
}
