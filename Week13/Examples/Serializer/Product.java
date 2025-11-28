import java.io.*;

class Product implements Serializable {
    private String productName;
    private double price;
    private int stock;

    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public void showInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}
