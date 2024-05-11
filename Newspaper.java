public class Newspaper implements Resource {
    private String title;

    public Newspaper(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        // Implement borrow logic for newspapers
        System.out.println("Borrowing newspaper: " + title);
    }


}