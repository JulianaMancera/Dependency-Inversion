public class Journal implements Resource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        // Implement borrow logic for journals
        System.out.println("Borrowing journal: " + title);
    }

 
}