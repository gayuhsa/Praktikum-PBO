public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Author 1");
        Author author2 = new Author("Author 2");
        Author author3 = new Author("Author 3");
        Author author4 = new Author("Author 4");
        
        Library library = new Library();
        
        library.addBook(new Book(author1, "Book 1"));
        library.addBook(new Book(author2, "Book 2"));
        library.addBook(new Book(author3, "Book 3"));
        library.addBook(new Book(author4, "Book 4"));
        
        library.libraryInfo();
    }
}
