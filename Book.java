public class Book implements Resource {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        // Implement borrowing logic for books
        System.out.println("Borrowing book: " + title);
    }
}