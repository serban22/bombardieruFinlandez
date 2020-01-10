package Week4.ex79_NumberStatistics;

import java.util.Scanner;

public class ex79_NumberStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        NumberStatistics statistics = new NumberStatistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Amount: " + statistics.amountOfNumbers());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());

        NumberStatistics statsSum = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();

        System.out.print("Type the desired numbers: ");
        int number = input.nextInt();
        while (number != -1) {
            statsSum.addNumber(number);
            if (number % 2 == 0) {
                statsEven.addNumber(number);
            } else {
                statsOdd.addNumber(number);
            }
            number = input.nextInt();
        }

        System.out.println("Sum: " + statsSum.sum());
        System.out.println("Even numbers sum: " + statsEven.sum());
        System.out.println("Odd numbers sum: " + statsOdd.sum());
    }
}
