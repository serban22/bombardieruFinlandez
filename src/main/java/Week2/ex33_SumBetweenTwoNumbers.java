package Week2;

import java.util.Scanner;

public class ex33_SumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What lower bound? ");
        int lowerBound = Integer.parseInt(input.nextLine());
        System.out.print("What upper bound? ");
        int upperBound = Integer.parseInt(input.nextLine());
        int sum = 0;

        while (lowerBound <= upperBound) {
            sum += lowerBound;
            lowerBound++;
        }
        System.out.println("Sum: " + sum);
    }
}
