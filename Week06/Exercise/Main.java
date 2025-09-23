// https://stackoverflow.com/questions/11832001/why-access-specifiers-cant-be-used-for-variables-declared-inside-method-in-a-ja
// https://community.monogame.net/t/direct-access-vs-setter-getter-performance/14546

package week06;

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