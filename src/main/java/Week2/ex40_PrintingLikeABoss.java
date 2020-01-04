package Week2;

public class ex40_PrintingLikeABoss {
    public static void main(String[] args) {
        printTriangle(5);
        System.out.println();
        xmasTree(4);
        System.out.println();
        xmasTree(10);
    }

    public static void printStars(int size) {
        int counter = 1;
        while (size >= counter) {
            System.out.print("*");
            counter++;
        }
        System.out.println("");
    }

    public static void printWhiteSpaces(int size) {
        int counter = 1;
        while (size >= counter) {
            System.out.print("");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        while (size >= counter) {
            printWhiteSpaces(counter);
            printStars(counter);
            counter++;
        }
    }

    public static void xmasTree(int height) {
        int counter = 1;
        while (height >= counter) {
            printWhiteSpaces(height - counter);
            printStars(2 * counter - 1);
            counter++;
        }
        counter = 2;
        while (--counter >= 0) {
            printWhiteSpaces(height - 2);
            printStars(3);
        }
    }
}
