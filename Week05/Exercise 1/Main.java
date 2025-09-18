public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Flap", "Bird");
        animal.displayInfo();
        animal.makeSound();
        
        System.out.println("");
        
        Cat cat = new Cat("Mimi");
        cat.displayInfo();
        cat.makeSound();
        
        System.out.println("");
        
        Dog dog = new Dog("Buddy");
        dog.displayInfo();
        dog.makeSound();
    }
}