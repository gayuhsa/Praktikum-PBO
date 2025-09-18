public class Cat extends Animal {
    public Cat(String name) {
        super(name, "Cat");
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Cat");
        super.displayInfo();
    }
    
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}