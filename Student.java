public class Student {
    public void borrowBook(String title) {
        Book book = new Book(title);
        book.borrow();
    }

    public void borrowJournal(String title) {
        Journal journal = new Journal(title);
        journal.borrow();
    }
}