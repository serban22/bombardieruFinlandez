package Week2;

import java.util.Scanner;

public class ex31_LowerLimitAndUpperLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type the lower limit: ");
        int lowerLimit = Integer.parseInt(input.nextLine());
        System.out.print("Type the upper limit: ");
        int upperLimit = Integer.parseInt(input.nextLine());

        while (lowerLimit <= upperLimit) {
            System.out.println(lowerLimit);
            if (lowerLimit >= upperLimit) {
                break;
            }
            lowerLimit++;
        }
    }
}
