import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {
        ArrayList<Product> productDairy = new ArrayList<>();

        Product productDairy1 = new Product("Milk", 2.69, 5);
        Product productDairy2 = new Product("Sour cream", 3.13, 3);
        Product productDairy3 = new Product("Kefir", 1.03, 2);

        productDairy.add(productDairy1);
        productDairy.add(productDairy2);
        productDairy.add(productDairy3);

        Category dairy = new Category("Dairy", productDairy);

        Product productBall1 = new Product("Football", 3.76, 1);
        Product productBall2 = new Product("Basketball", 4.76, 2);
        Product productBall3 = new Product("Tennis", 1.3, 3);
        Product productBall4 = new Product("Rugby", 6, 6);

        ArrayList<Product> productBall = new ArrayList<>();

        productBall.add(productBall1);
        productBall.add(productBall2);
        productBall.add(productBall3);
        productBall.add(productBall4);

        Category Ball = new Category("Ball", productBall);

        ArrayList<Product> productsBasket = new ArrayList<>();
        productsBasket.add(productBall1);
        productsBasket.add(productDairy2);

        Basket basket = new Basket(productsBasket);

        User user1 = new User("Login", "Password", basket);
    }
}
