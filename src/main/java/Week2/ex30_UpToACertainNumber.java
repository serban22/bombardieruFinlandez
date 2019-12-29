package Week2;

import java.util.Scanner;

public class ex30_UpToACertainNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int limit = Integer.parseInt(input.nextLine());
        int startNumber = 1;

        while (startNumber <= limit) {
            System.out.println(startNumber);
            startNumber++;
        }
    }
}
