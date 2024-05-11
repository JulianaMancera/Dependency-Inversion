public class Book implements Resource {
    private String bookTitle;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public void borrow() {
        // Implement borrow logic for books
        System.out.println("Borrowing book: " + bookTitle);
    }

  
}