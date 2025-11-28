import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String TEXT_FILE = "/home/user/oop/book.txt";
    private static final String SERIAL_FILE = "/home/user/oop/book.ser";
    private static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Commands:");
        System.out.println("add [title] [author] [publish year] -> Add a book");
        System.out.println("save -> Save as a .txt file");
        System.out.println("ser -> Save as a .ser file");
        System.out.println("showall -> Show all saved books");
        System.out.println("q -> Exit\n");

        while (true) {
            String fullCommand = scanner.nextLine();
            String command = "";
            List<String> arguments = new ArrayList<>(Arrays.asList(fullCommand.split(" ")));

            if (!arguments.isEmpty()) {
                command = arguments.get(0).toLowerCase();
                arguments.remove(0);
            }

            switch (command) {
                case "add" ->
                    addBook(arguments);
                case "save" ->
                    saveToTxt();
                case "ser" ->
                    saveToSer();
                case "showall" ->
                    showBooks();
                case "q" -> {
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
                }
                default ->
                    System.out.println("Invalid command.");
            }
        }
    }

    private static void addBook(List<String> parameters) {
        try {
            if (parameters.size() < 3) {
                throw new IllegalArgumentException("Invalid parameter length");
            }

            String title = parameters.get(0);
            String author = parameters.get(1);
            int publishYear = Integer.parseInt(parameters.get(2));

            bookList.add(new Book(title, author, publishYear));
            System.out.println(title + " by " + author + " successfully added.");
        } catch (Exception error) {
            System.out.println("An error occurred: " + error.getMessage());
            error.printStackTrace();
        }
    }

    private static void saveToTxt() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Book book : bookList) {
                writer.write(book.toString() + "\n");
            }

            System.out.println("Successfully saved to " + TEXT_FILE);
        } catch (IOException error) {
            System.out.println("An error occurred: " + error.getMessage());
            error.printStackTrace();
        }
    }

    private static void saveToSer() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bookList);
            System.out.println("Successfully saved to " + SERIAL_FILE);
        } catch (IOException error) {
            System.out.println("An error occurred: " + error.getMessage());
            error.printStackTrace();
        }
    }

    private static void showBooks() {
        if (bookList.size() > 0) {
            System.out.println("Books list:");
            for (Book book : bookList) {
                book.showInfo();
                System.out.println("");
            }
        } else {
            System.out.println("Book list is empty.");
        }
    }
}
