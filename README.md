# Dependency-Inversion

## NEU Library Resource Management System <br>
**Problem**<br>
&emsp; The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers. Currently, the system for managing student borrowing directly depends on specific resource types, violating the Dependency Inversion Principle (DIP) and hindering flexibility for future changes. <br>

### UML Class Diagram <br>
+ **Resource:** An interface representing a generic library resource with method borrow().
+ **Book, Thesis, Capstone, InternetAccess, Journal, Newspaper:** Concrete classes implementing the Resource interface, each representing a specific type of library resource.
+ **ResourceManagement:** A class responsible for managing the borrowing and returning of resources.
+ **Student:** A class representing a student with properties name and id, and methods to access these properties.
+ **LibrarySystem:** Validates the refactored code by creating a Student object and borrowing different types of resources.<br> <br>
![UML DIP (1)](https://github.com/Julsaurus/Dependency-Inversion/assets/133284711/8305aef1-9a3b-4e24-a662-3da01f9d9c60) <br>

### Solution <br>
&emsp; To follow the Dependency Inversion Principle (DIP) and ensure flexibility for future changes, the system must be refactored while adhering to SOLID principles. The proposed solution adds an abstraction layer between the Student class and the individual resource types. This abstraction separates the Student class from concrete resource implementations, allowing for the seamless integration of new resource types in the future.
