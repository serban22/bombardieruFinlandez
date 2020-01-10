package Week4.ex73_Product;

public class ex73_Product {
    public static void main(String[] args) {
        Product banana = new Product(5, 5, "Banana");
        Product apple = new Product(6, 10, "Apple");
        Product orange = new Product(8, 7, "Orange");
        Product mango = new Product(10, 6, "Mango");

        banana.printProduct();
        apple.printProduct();
        orange.printProduct();
        mango.printProduct();
    }
}
