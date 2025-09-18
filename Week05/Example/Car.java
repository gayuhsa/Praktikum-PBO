public class Car extends Vehicle {
    int doorAmount;
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Door Amount: " + doorAmount);
    }
}