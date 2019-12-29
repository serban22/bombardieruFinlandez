package Week2;

public class ex29_EvenNumbers {
    public static void main(String[] args) {
        int number = 2;
        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
