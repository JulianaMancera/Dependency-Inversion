public class Capstone implements Resource {
    private String capstoneTitle;

    public Capstone(String capstoneTitle) {
        this.capstoneTitle = capstoneTitle;
    }

    @Override
    public void borrow() {
        // Implement borrow logic for capstones
        System.out.println("Borrowing capstone: " + capstoneTitle);
    }


}