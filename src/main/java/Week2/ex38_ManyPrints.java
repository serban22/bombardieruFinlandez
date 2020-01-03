package Week2;

import java.util.Scanner;

public class ex38_ManyPrints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many times? ");
        int number = Integer.parseInt(input.nextLine());
        int counter = 0;
        while (counter <= number) {
            printText();
            counter++;
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
