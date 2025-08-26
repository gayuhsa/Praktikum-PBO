import java.util.Scanner;

public class Week01 {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = InputScanner.nextLine();

        System.out.print("Enter Student ID: ");
        String id = InputScanner.nextLine();

        System.out.print("Enter Address: ");
        String address = InputScanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = InputScanner.nextLine();

        System.out.println("\nName: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
}