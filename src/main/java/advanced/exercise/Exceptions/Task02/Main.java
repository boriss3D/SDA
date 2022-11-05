package advanced.exercise.Exceptions.Task02;

public class Main {
    public static void main(String[] args) throws NoBookFoundException {
        Book book01 = new Book(1, "Harry Potter and the Philosopher's Stone", "J. K. Rowling",
                "1997");
        Book book02 = new Book(2, "Harry Potter and the Chamber of Secrets", "J. K. Rowling",
                "1998");
        Book book03 = new Book(3, "Harry Potter and the Prisoner of Azkaban", "J. K. Rowling",
                "1999");

        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(book01);
        bookRepository.addBook(book02);
        System.out.println("Books in Repository");
        for (Book b : bookRepository.getArrayList()) {
            System.out.println(b);
        }
        System.out.println();

        System.out.println("Removing object Book...");
        bookRepository.removeBook(book02);
        bookRepository.removeBook(book03);
        System.out.println();

        System.out.println("Searching by title...");
        bookRepository.searchByBookTitle("Harry Potter and the Philosopher's Stone");
        System.out.println();

        System.out.println("Searching by ID...");
        bookRepository.searchByBookID(1);
        System.out.println();

        System.out.println("Removing by ID...");
        bookRepository.removeBookByID(1);
        bookRepository.removeBookByID(4);
        System.out.println();

        System.out.println("Searching by title...");
        bookRepository.searchByBookTitle("Holy Bible");
        System.out.println();
    }
}
