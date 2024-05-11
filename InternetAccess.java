public class InternetAccess implements Resource {
    private String username;

    public InternetAccess(String username) {
        this.username = username;
    }

    @Override
    public void borrow() {
        // Implement borrow logic for internet access
        System.out.println("Granting internet access to user: " + username);
    }

 
}