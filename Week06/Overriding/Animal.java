package overriding;

class Animal {
    public void makeSound() {
        System.out.println("This animal is making a sound");
    }
    
    public void eat(String food) {
        System.out.println("This animal is eating a " + food);
    }
    
    public void eat(String food, int amount) {
        System.out.println("This animal is eating " + amount + " portions of " + food);
    }
}