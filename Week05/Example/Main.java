public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Toyota";
        car.speed = 180;
        car.doorAmount = 4;
        car.displayInfo();
        
        System.out.println("");
        
        Bike bike = new Bike();
        bike.name = "Yamaha";
        bike.speed = 120;
        bike.engineType = "2-tak";
        bike.displayInfo();
    }
}