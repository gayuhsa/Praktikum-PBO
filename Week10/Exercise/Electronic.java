public class Electronic implements Payment {
    @Override
    public double calculateTax(double price) {
        return price * 0.1;
    }
}
