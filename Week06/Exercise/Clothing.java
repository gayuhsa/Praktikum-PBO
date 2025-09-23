package polymorphism;

public class Clothing extends Product {
    public String name;
    public int price;
    
    public Clothing(String name, int price) {
        super(name, price);
    }
    
    @Override
    public double getDiscount() {
        return 0.15;
    }
}