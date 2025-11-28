import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "/home/user/oop/product.ser";

        Product product = new Product("Laptop", 1500, 10);

        // Serialize the object into a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(product);
            System.out.println("Saved to file: " + filePath);
        } catch (IOException error) {
            System.out.println("An error occured:");
            error.printStackTrace();
        }

        // Deserialize the file to a Java object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Product deserializedProduct = (Product) ois.readObject();
            System.out.println("\nRead from file:");
            deserializedProduct.showInfo();
        } catch (IOException | ClassNotFoundException error) {
            System.out.println("An error occured:");
            error.printStackTrace();
        }
    }
}
