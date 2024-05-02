public class TestProgram {
    public static void main(String[] args) {
        // Create a Student
        Student student = new Student();

        // Borrow a book
        Resource book = new Book("Introduction to Object Oriented Programming");
        student.borrowResource(book);

        // Borrow a journal
        Resource journal = new Journal("OOP Journal");
        student.borrowResource(journal);
    }
}