package Week1;

import java.util.Scanner;

public class ex22_Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String actualPassword = "carrot";

        while (true) {
            System.out.print("Type the password: ");
            String inputPassword = input.nextLine();
            if (inputPassword.equalsIgnoreCase(actualPassword)) {
                System.out.println("Correct password!");
                System.out.println("Secret message: vegetables");
                break;
            } else {
                System.out.println("Wrong password!");
            }
        }

    }
}
