public class Capstone implements Resource {
    private String title;

    public Capstone(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        // Implement borrow logic for capstones
        System.out.println("Borrowing capstone: " + title);
    }


}