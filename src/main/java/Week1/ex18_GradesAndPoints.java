package Week1;

import java.util.Scanner;

public class ex18_GradesAndPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type the points (0 to 60): ");
        int points = input.nextInt();

        if (points >= 0 && points <= 29) {
            System.out.println("Failed.");
        } else if (points >= 30 && points <= 34) {
            System.out.println("Grade: 1");
        } else if (points >= 35 && points <= 39) {
            System.out.println("Grade: 2");
        } else if (points >= 40 && points <= 44) {
            System.out.println("Grade: 3");
        } else if (points >= 45 && points <= 49) {
            System.out.println("Grade: 4");
        } else if (points >= 50 && points <= 60) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Type a number of points between 0 and 60.");
        }
    }
}
