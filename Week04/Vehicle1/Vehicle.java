public class Vehicle {
    private String make;
    private String model;
    private int year;
    
    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Getter and setter for make
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    // Getter and setter for model
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    // Getter and setter for year
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
}