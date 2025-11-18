class Book {
    private String title;
    
    public Book(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void bookInfo() {
        System.out.println("Book Title: " + title);
    }
}
