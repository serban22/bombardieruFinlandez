package Week2;

import hangman.Hangman;
import java.util.Scanner;


public class ex42_HangmanGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************");
        System.out.println("");
        printMenu();
        System.out.println("");

        while (hangman.gameOn()) {
            System.out.print("Type the desired command: ");
            String command = input.nextLine();
            if (command.equalsIgnoreCase("quit")) {
                System.out.println("Thank you for playing!");
                break;
            } else if (command.equalsIgnoreCase("status")) {
                hangman.printStatus();
            } else if (command.length() == 1) {
                hangman.guess(command);
            } else if (command.isEmpty()) {
                System.out.println("You didn't type anything!");
                printMenu();
            } else {
                System.out.println("I found a letter!");
            }
            hangman.printMan();
            hangman.printWord();
        }
        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
