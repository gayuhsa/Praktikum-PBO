public class GroundVehicle extends Vehicle {
    public int wheelAmount;
    public String drivetrain;
    public String engineType;
    
    public GroundVehicle(String make, String model, int wheelAmount, String drivetrain, String engineType) {
        super(make, model);
        this.wheelAmount = wheelAmount;
        this.drivetrain = drivetrain;
        this.engineType = engineType;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("├─ Wheel Amount: " + wheelAmount);
        System.out.println("├─ Drivetrain: " + drivetrain);
        System.out.println("├─ Engine Type: " + engineType);
    }
    
    public void startEngine() {
        System.out.println(make + " " + model + "'s engine started");
    }
}