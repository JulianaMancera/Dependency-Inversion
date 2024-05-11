public class Newspaper implements Resource {
    private String newspapaerTitle;

    public Newspaper(String newspapaerTitle) {
        this.newspapaerTitle = newspapaerTitle;
    }

    @Override
    public void borrow() {
        // Implement borrow logic for newspapers
        System.out.println("Borrowing newspaper: " + newspapaerTitle);
    }


}