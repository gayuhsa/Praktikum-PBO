package polymorphism;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Dictionary", 500);
        Electronic computer = new Electronic("Computer", 4000);
        Clothing shirt = new Clothing("Shirt", 600);
        
        Cart shoppingCart = new Cart();
        shoppingCart.products.add(book);
        shoppingCart.products.add(computer);
        shoppingCart.products.add(shirt);
        
        shoppingCart.displayItems();
        System.out.println("Total price: " + shoppingCart.calculateTotalPrice());
    }
}