public class Car extends GroundVehicle {
    public int doorAmount;
    
    public Car(String make, String model, int wheelAmount, String drivetrain, String engineType, int doorAmount) {
        super(make, model, wheelAmount, drivetrain, engineType);
        this.doorAmount = doorAmount;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("└── Door Amount: " + doorAmount);
    }
}