public class Thesis implements Resource {
    private String title;

    public Thesis(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        // Implement borrow logic for theses
        System.out.println("Borrowing thesis: " + title);
    }

}
