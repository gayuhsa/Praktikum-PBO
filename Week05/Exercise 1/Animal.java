public class Animal {
    public String name;
    public String type;
    
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + "\nType: " + type);
    }
    
    public void makeSound() {
        System.out.println("This animal makes a sound");
    }
}