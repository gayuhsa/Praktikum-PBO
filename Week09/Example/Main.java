public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        
        car.move();
        car.info();
        
        bike.move();
        bike.info();
    }
}