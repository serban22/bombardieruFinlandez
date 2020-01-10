package Week4.ex74_Multiplier;

public class ex74_Multiplier {
    public static void main(String[] args) {
        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

        Multiplier fourMultiplier = new Multiplier(4);
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

        Multiplier sixMultiplier = new Multiplier(6);
        System.out.println("sixMultiplier.multiply(5): " + sixMultiplier.multiply(5));

        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));
        System.out.println("sixMultiplier.multiply(4): " + sixMultiplier.multiply(4));
    }
}
