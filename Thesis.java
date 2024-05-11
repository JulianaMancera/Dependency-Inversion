public class Thesis implements Resource {
    private String thesisTitle;

    public Thesis(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public void borrow() {
        // Implement borrow logic for theses
        System.out.println("Borrowing thesis: " + thesisTitle);
    }

}
