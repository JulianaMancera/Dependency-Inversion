public class LibrarySystem {
    public static void main(String[] args) {

        System.out.println("Welcome to NEU Library\n");
        Student student = new Student("8700", "Juls");

        System.out.println("Student: " + student.getName() + "\nID: " + student.getStudentNum()+"\n");

        Resource book = new Book("Mastering the Art of Software Engineering");
        Resource thesis = new Thesis("Exploring the Evolution of Programming Paradigms: A Comparative Study");
        Resource capstone = new Capstone("Automating Software Testing with AI-Driven Test Case Generation");
        Resource internetAccess = new InternetAccess("Julsaurus");
        Resource journal = new Journal("Journal of Computer Programming");
        Resource newspaper = new Newspaper("Unraveling the Latest Trends in Programming");

        // Student borrows a book
        ResourceManagement.borrowResource(student, book);

        // Student borrows a thesis
        ResourceManagement.borrowResource(student, thesis);

        // Student borrows a capstone
        ResourceManagement.borrowResource(student, capstone);

        // Student requests internet access
        ResourceManagement.borrowResource(student, internetAccess);

        // Student borrows a journal
        ResourceManagement.borrowResource(student, journal);

        // Student borrows a newspaper
        ResourceManagement.borrowResource(student, newspaper);

    }
}