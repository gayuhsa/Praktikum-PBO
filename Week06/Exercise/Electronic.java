package week06;

public class Electronic extends Product {
    public String name;
    public int price;
    
    public Electronic(String name, int price) {
        super(name, price);
    }
    
    @Override
    public double getDiscount() {
        return 0.1;
    }
}