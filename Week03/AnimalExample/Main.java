public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Mimi", 3);
        cat.makeSound();
        cat.info();
        
        System.out.println("");
        
        Animal dog = new Animal("Clifford", 2);
        dog.info();
        dog.run();
    }
}
