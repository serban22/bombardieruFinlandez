package Week2;

import java.util.Scanner;

public class ex36_LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (true) {
            System.out.print("Type the numbers: ");
            int number = Integer.parseInt(input.nextLine());
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            } else {
                sum = sum + number;
                counter++;
            } if (number % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        double average = ((double) sum / counter);
        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("The average is: " + average);
        System.out.println("How many odd numbers: " + oddNumbers);
        System.out.println("How many even numbers: " + evenNumbers);
    }
}
