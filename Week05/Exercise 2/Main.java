public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "RS200", 4, "AWD", "Straight-4", 2);
        car.displayInfo();
        car.startEngine();
        
        System.out.println("");
        
        Bike bike = new Bike("Yamaha", "YZF-R1", 2, "RWD", "Straight-4", 998);
        bike.displayInfo();
        bike.startEngine();
    }
}