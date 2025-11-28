import java.io.*;

class Book implements Serializable {
    private String title;
    private String author;
    private int publishYear;

    public Book(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publish Year: " + publishYear);
    }
}
