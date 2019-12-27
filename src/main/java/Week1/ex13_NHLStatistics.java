package Week1;

import nhlstats.NHLStatistics;

public class ex13_NHLStatistics {
    public static void main(String[] args) {
        System.out.println("Top ten by goals:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println();
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println();
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println(); //they appear this way because they have been sorted by goals and penalties in the previous commands
        NHLStatistics.teamStatistics("PHI");
        System.out.println();
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
