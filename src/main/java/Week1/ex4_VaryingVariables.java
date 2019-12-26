package Week1;

public class ex4_VaryingVariables {
    public static void main(String[] args) {
        String chickens = "Chickens: ";
        int noChickens = 3;
        String bacon = "Bacon (kg): ";
        double baconKg = 5.5;
        String tractor = "A tractor: ";
        String tractorName = "There is none!";
        String nutshell = "In a nutshell:";
        System.out.println(chickens + "\n" + noChickens);
        System.out.println(bacon + "\n" + baconKg);
        System.out.println(tractor + "\n" + tractorName + "\n");
        System.out.println(nutshell + "\n" + noChickens + "\n" + baconKg + "\n" + tractorName + "\n");

        noChickens = 9000;
        baconKg = 0.1;
        tractorName = "Zetor";
        System.out.println("REPRINTED WITH NEW VARIABLES:");
        System.out.println(chickens + "\n" + noChickens);
        System.out.println(bacon + "\n" + baconKg);
        System.out.println(tractor + "\n" + tractorName + "\n");
        System.out.println(nutshell + "\n" + noChickens + "\n" + baconKg + "\n" + tractorName);


    }
}
