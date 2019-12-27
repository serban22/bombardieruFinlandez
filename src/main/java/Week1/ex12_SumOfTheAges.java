package Week1;

import java.util.Scanner;

public class ex12_SumOfTheAges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the name and age of the first person: ");
        String name1 = input.nextLine();
        int age1 = Integer.parseInt(input.nextLine());
        System.out.println("\nType the name and age of the second person: ");
        String name2 = input.nextLine();
        int age2 = Integer.parseInt(input.nextLine());
        System.out.println(name1 + " and " + name2 + " are " + (age1 + age2) + " years old in total.");
    }
}
