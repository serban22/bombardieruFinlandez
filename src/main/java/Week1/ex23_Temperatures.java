package Week1;

import java.util.Scanner;

public class ex23_Temperatures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type the temperature: ");
        double temperature = Double.parseDouble(input.nextLine());

        while (true) {
            if (temperature > -30.0 && temperature < 40.0) {
                System.out.println("The temperature is: " + temperature);
            } else {
                System.out.println("Incredible temperature!");
            }
            break;
        }
    }
}
