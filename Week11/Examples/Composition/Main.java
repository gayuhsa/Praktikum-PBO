public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        
        library.addBook(new Book("Book 1"));
        library.addBook(new Book("Book 2"));
        library.addBook(new Book("Book 3"));
        library.addBook(new Book("Book 4"));
        
        library.libraryInfo();
    }
}
