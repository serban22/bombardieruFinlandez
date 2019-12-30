package Week2;

import java.util.Scanner;

public class ex34_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type the number: ");
        int n = Integer.parseInt(input.nextLine());
        long fact = 1;
        int i = 1;

        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial: " + fact);
    }
}
