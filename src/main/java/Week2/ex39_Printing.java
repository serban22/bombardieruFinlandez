package Week2;

public class ex39_Printing {
    public static void main(String[] args) {
        printStars(10);
        System.out.println();
        printSquare(6);
        System.out.println();
        printRectangle(4, 7);
        System.out.println();
        printTriangle(5);
    }

    public static void printStars(int amount) {
        int counter = 1;
        while (amount >= counter) {
            System.out.print("*" + " ");
            counter++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        int counter = 1;
        while (counter <= sideSize) {
            printStars(sideSize);
            counter++;
        }
    }

    public static void printRectangle(int width, int height) {
        int counter = 1;
        while (counter <= height) {
            printStars(width);
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        while (counter <= size) {
            printStars(counter);
            counter++;
        }
    }
}
