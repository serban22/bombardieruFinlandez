package Week1;

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class ex24_NHLStatistics2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("NHL statistics service");
        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = input.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                break;
            }

            if (command.equalsIgnoreCase("points")) {
                NHLStatistics.sortByPoints();
                NHLStatistics.top(15);
                System.out.println();
            } else if (command.equalsIgnoreCase("goals")) {
                NHLStatistics.sortByGoals();
                NHLStatistics.top(15);
                System.out.println();
            } else if (command.equalsIgnoreCase("assists")) {
                NHLStatistics.sortByAssists();
                NHLStatistics.top(15);
                System.out.println();
            } else if (command.equalsIgnoreCase("penalties")) {
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(15);
                System.out.println();
            } else if (command.equalsIgnoreCase("player")) {
                System.out.print("Type the player's name: ");
                String playerName = input.nextLine();
                NHLStatistics.searchByPlayer(playerName);
                System.out.println();
            } else if (command.equalsIgnoreCase("club")) {
                System.out.print("Type the club's name: ");
                String clubName = input.nextLine();
                NHLStatistics.teamStatistics(clubName);
            } else {
                System.out.println("Wrong command!");
            }
        }
    }
}
