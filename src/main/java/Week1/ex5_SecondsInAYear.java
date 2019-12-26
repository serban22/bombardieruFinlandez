package Week1;

public class ex5_SecondsInAYear {
    public static void main(String[] args) {
        int seconds = 60;
        int secondsInAnHour = seconds * 60;
        int secondsInADay = secondsInAnHour * 24;
        int secondsInAYear = secondsInADay * 365;
        System.out.println("There are " + secondsInAYear + " seconds in a year.");
    }
}
