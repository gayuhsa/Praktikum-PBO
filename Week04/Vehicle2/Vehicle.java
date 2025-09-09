public class Vehicle {
    // Attributes with different access modifiers
    private String name;        // Only accessible from this class
    protected int maxSpeed;     // Can be accessed in the same package and subclasses
    public String engineType;   // Can be accessed anywhere
    
    // Constructor
    public Vehicle(String name, int maxSpeed, String engineType) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }
    
    // Getter and setter for name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Public method to display the vehicle info
    public void showVehicleInfo() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Engine Type: " + engineType);
    }
}