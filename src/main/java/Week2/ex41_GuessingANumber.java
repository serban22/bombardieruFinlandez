package Week2;

import java.util.Random;
import java.util.Scanner;

public class ex41_GuessingANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = drawNumber();
        int counter = 0;

        while (true) {
            System.out.print("Type the number that will be guessed: ");
            int typedNumber = Integer.parseInt(input.nextLine());
            counter++;
            if (typedNumber > randomNumber) {
                System.out.println("The number is lesser, guesses made: " + counter);
            } else if (typedNumber < randomNumber) {
                System.out.println("The number is greater, guesses made: " + counter);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    public static int drawNumber() {
        return new Random().nextInt(100);
    }
}
