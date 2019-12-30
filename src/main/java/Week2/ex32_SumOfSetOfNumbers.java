package Week2;

import java.util.Scanner;

public class ex32_SumOfSetOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Until what? ");
        int n = Integer.parseInt(input.nextLine());
        int counter = 0, sum = 0;

        while (counter < n) {
            counter++;
            sum += counter;
        }
        System.out.println("Sum: " + sum);
    }
}
