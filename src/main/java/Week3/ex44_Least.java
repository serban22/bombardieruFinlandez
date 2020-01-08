package Week3;

public class ex44_Least {
    public static int least(int number1, int number2) {
        int least;
        if (number1 < number2) {
            least = number1;
        } else {
            least = number2;
        }
        return least;
    }

    public static void main(String[] args) {
        int answer = least(12, 9);
        System.out.println("Least: " + answer);
    }
}
