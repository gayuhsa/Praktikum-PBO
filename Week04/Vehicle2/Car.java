public class Car extends Vehicle {
    private int doorAmount; // Special attribute for cars
    
    // Constructor
    public Car(String name, int maxSpeed, String engineType, int doorAmount) {
        super(name, maxSpeed, engineType); // Call the parent class' constructor
        this.doorAmount = doorAmount;
    }
    
    // Method to display the car info
    public void showCarInfo() {
        // maxSpeed can be accessed because it's protected
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Door Amount: " + doorAmount);
    }
}