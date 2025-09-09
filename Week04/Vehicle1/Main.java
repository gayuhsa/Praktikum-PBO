public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Aston Martin", "DB3", 1959);
        
        // Showing initial data
        System.out.println("Initial attributes:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        
        // Modify the data
        car.setModel("DB9");
        car.setYear(2016);
        
        // Showing the data after being modified
        System.out.println("\nModified attributes:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}