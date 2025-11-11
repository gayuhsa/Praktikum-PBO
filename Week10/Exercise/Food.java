public class Food implements Payment {
    @Override
    public double calculateTax(double price) {
        return price * 0.05;
    }
}
