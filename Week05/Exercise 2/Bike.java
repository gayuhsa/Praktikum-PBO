public class Bike extends GroundVehicle {
    public int engineDisplacement;
    
    public Bike(String make, String model, int wheelAmount, String drivetrain, String engineType, int engineDisplacement) {
        super(make, model, wheelAmount, drivetrain, engineType);
        this.engineDisplacement = engineDisplacement;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("└── Displacement: " + engineDisplacement + " cc");
    }
}