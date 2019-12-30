package Week2;

import java.util.Scanner;

public class ex35_SumOfPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, powerOfNum = 0, result, finalResult = 0;

        System.out.print("Type the number: ");
        n = Integer.parseInt(input.nextLine());

        while (powerOfNum <= n) {
            result = (int)Math.pow(2, powerOfNum);
            finalResult += result;
            powerOfNum++;
        }
        System.out.printf("Result: %d ", finalResult);
    }
}
