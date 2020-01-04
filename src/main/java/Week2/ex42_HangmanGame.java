package Week2;

import java.util.Scanner;

public class ex42_HangmanGame {

    public boolean GameOn() {
        return true;
    }

    public void printStatus() {
        System.out.println("You have not made any guesses yet.");
        System.out.println("Unused letters: abcdefghijklmnoprstuvwxyz");
    }

    public void printWord() {
        StringBuilder unknownWord = new StringBuilder("?????????");
        System.out.println("Word to be guessed: " + unknownWord);
    }

    public void printMan() {
        System.out.println(" __ __");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println("/|");
    }

    public void guess(String letter) {
        String secretWord = "christmas";
        if (secretWord.contains(letter)) {
            System.out.println("The letter " + letter + " was found in the word.");
        } else {
            System.out.println("The letter " + letter + " is not in this word.");
        }
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}

class HangmanGameRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ex42_HangmanGame hangmanGame = new ex42_HangmanGame();

        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************");
        System.out.println("");
        ex42_HangmanGame.printMenu();
        System.out.println("");

        while (hangmanGame.GameOn()) {
            System.out.print("Type the desired command: ");
            String command = input.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                System.out.println("Thank you for playing!");
                break;
            } else if (command.equalsIgnoreCase("status")) {
                hangmanGame.printStatus();
            } else if (command.length() == 1) {
                hangmanGame.guess(command);
            } else if (command.isEmpty()) {
                System.out.println("Empty string!");
                ex42_HangmanGame.printMenu();
            } else {
                System.out.println("Found a letter!");
            }
            hangmanGame.printMan();
            hangmanGame.printWord();
        }
        System.out.println("Thank you for playing!");
    }
}