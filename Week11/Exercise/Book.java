class Book {
    private Author author;
    private String title;
    
    public Book(Author author, String title) {
        this.author = author;
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void bookInfo() {
        System.out.println("Book Title: " + title);
        author.authorInfo();
    }
}
