public class Dog extends Animal {
    public Dog(String name) {
        super(name, "Dog");
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Dog");
        super.displayInfo();
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}