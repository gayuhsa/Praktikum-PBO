public class Week02 {
    public static void main(String[] args) {
        Car car1 = new Car("Mitsubishi", "Lancer Evo 5", "Yellow", 1998);
        car1.displayInfo();
        car1.startEngine();
        
        System.out.println("");
        
        Car car2 = new Car("Chrysler", "PT Cruiser", "Black", 2010);
        car2.displayInfo();
        car2.startEngine();
        
        System.out.println("");
        
        car2.setColor("Bright Silver");
        car2.displayInfo();
    }
}
