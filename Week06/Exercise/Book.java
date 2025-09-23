package polymorphism;

public class Book extends Product {
    public String name;
    public int price;
    
    public Book(String name, int price) {
        super(name, price);
    }
    
    @Override
    public double getDiscount() {
        return 0.2;
    }
}