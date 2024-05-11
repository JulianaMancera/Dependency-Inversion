public class Journal implements Resource {
    private String journalTitle;

    public Journal(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    @Override
    public void borrow() {
        // Implement borrow logic for journals
        System.out.println("Borrowing journal: " + journalTitle);
    }

 
}