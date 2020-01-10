package Week4.ex73_Product;

public class Product {
    private double price;
    private int amount;
    private String name;

    public Product(double price, int amount, String name) {
        this.price = price;
        this.amount = amount;
        this.name = name;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
}
