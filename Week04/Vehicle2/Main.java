public class Main {
    public static void main(String[] args) {
        Car car = new Car("Dodge Viper", 332, "V10", 2);
        
        // Showing initial data
        System.out.println("Initial attributes:\nVehicle class:");
        car.showVehicleInfo();
        
        System.out.println("\nCar class:");
        car.showCarInfo();
        
        // Modifying data
        car.setName("Dodge Ram");
        
        // Showing data after the changes
        System.out.println("\nModified attributes:\nVehicle class:");
        car.showVehicleInfo();
        
        System.out.println("\nCar class:");
        car.showCarInfo();
    }
}