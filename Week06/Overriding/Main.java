package overriding;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animal:");
        
        Animal animal = new Animal();
        animal.makeSound(); // Output: This animal is making a sound
        
        System.out.println("\nCat:");
        
        Cat cat = new Cat();
        cat.makeSound(); // Output: Meow
        cat.eat("fish"); // // Calling eat() method from the Animal class
        cat.eat("fish", 2); // Calling the overloaded eat() method
        
        System.out.println("\nDog:");
        
        Dog dog = new Dog();
        dog.makeSound(); // Output: Woof
        dog.eat("meat");
        dog.eat("meat", 3); // Calling the overloaded eat() method
    }
}