public class Book implements Resource {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        // Implement borrow logic for books
        System.out.println("Borrowing book: " + title);
    }

  
}