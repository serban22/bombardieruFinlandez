package Week2;

import java.util.Scanner;

public class ex26_SumOfManyNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Type the number: ");
            int read = Integer.parseInt(input.nextLine());
            if (read == 0) {
                break;
            } else {
                sum = sum + read;
            }
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }
}
