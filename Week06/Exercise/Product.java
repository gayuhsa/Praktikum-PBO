package polymorphism;

public abstract class Product {
    public String name;
    public int price;
    
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public double getDiscount() {
        return 0;
    }
}