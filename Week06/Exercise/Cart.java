package week06;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> products = new ArrayList<Product>();
    
    public double calculateTotalPrice() {
        double totalPrice = 0;
        
        for (Product product : products) {
            totalPrice = totalPrice + product.price * (1 - product.getDiscount());
        }
        
        return totalPrice;
    }
    
    public void displayItems() {
        System.out.println("Items in cart:");
        
        for (Product product : products) {
            double discount = 1 - product.getDiscount();
            double finalPrice = discount * product.price;
            System.out.println("- " + product.name + ", price: " + product.price + ", discount: " + discount * 100 + "%, price after discount: " + finalPrice);
        }
    }
}