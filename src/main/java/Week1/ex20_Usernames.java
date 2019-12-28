package Week1;

import java.util.Scanner;

public class ex20_Usernames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your username: ");
        String username = input.nextLine();
        System.out.print("Type your password: ");
        String password = input.nextLine();

        String recognizedUsername1 = "serban";
        String recognizedPassword1 = "tastatura";
        String recognizedUsername2 = "smaranda";
        String recognizedPassword2 = "intellij";

        if ((username.equalsIgnoreCase(recognizedUsername1) && (password.equalsIgnoreCase(recognizedPassword1))
        || (username.equalsIgnoreCase(recognizedUsername2) && (password.equalsIgnoreCase(recognizedPassword2))))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("The system does not recognize your username and password!");
        }
    }
}
