import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> bookList;
    
    public Library() {
        this.bookList = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        bookList.add(book);
    }
    
    public void libraryInfo() {
        for (Book book : bookList) {
            book.bookInfo();
            System.out.println("");
        }
    }
}
