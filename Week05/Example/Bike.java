public class Bike extends Vehicle {
    String engineType;
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + engineType);
    }
}