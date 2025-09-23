package overloading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cat 1:");
        
        Animal cat = new Animal();
        cat.makeSound(); // Output: This animal is making a sound
        cat.eat("fish"); // Calling eat() method from the Animal class
        cat.eat("fish", 2); // Calling the overloaded eat() method
        
        System.out.println("\nCat 2:");
        
        Animal cat2 = new Animal();
        cat2.makeSound();
        cat2.eat("chicken");
        cat2.eat("chicken", 3);
    }
}