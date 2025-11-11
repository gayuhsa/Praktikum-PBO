public class Main {
    public static void main(String[] args) {
        Electronic electronic = new Electronic();
        System.out.println("Tax for an electronic that costs 2000: " + electronic.calculateTax(2000));
        
        Food food = new Food();
        System.out.println("Tax for a food that costs 10: " + food.calculateTax(10));
    }
}
