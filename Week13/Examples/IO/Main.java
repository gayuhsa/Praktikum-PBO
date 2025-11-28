import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "/home/user/oop/data.txt";

        // Writing data to a file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello world!\n");
            writer.write("This file is generated from a Java program.\n");
            System.out.println("Successfully written to file:  " + filePath);
        } catch (IOException error) {
            System.out.println("An error occured:");
            error.printStackTrace();
        }

        // Reading data from a file
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            System.out.println("\nFile contents:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException error) {
            System.out.println("An error occured:");
            error.printStackTrace();
        }
    }
}
