public class Vehicle {
    public String make;
    public String model;
    
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    public void displayInfo() {
        System.out.println("Vehicle");
        System.out.println("├ Make: " + make);
        System.out.println("├ Model: " + model);
    }
}