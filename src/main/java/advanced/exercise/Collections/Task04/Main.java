package advanced.exercise.Collections.Task04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Author author01 = new Author("J. K.", "Rowling", "women");
        Author author02 = new Author("Edgar Rice", "Burroughs", "men");

        ArrayList<Author> list01 = new ArrayList<>();
        list01.add(author01);
        ArrayList<Author> list02 = new ArrayList<>();
        list02.add(author02);


        Book book01 = new Book("Harry Potter and the Philosopher's Stone", 10.0,
                LocalDate.of(1997, 2, 22), list01, Genre.FANTASY);
        Book book02 = new Book("Harry Potter and the Chamber of Secrets", 11.0,
                LocalDate.of(2000, 3, 2), list01, Genre.MYSTERY);
        Book book03 = new Book("Tarzan", 9.0,
                LocalDate.of(1912, 8, 15), list02, Genre.ROMANCE);

        ArrayList<Book> booksList = new ArrayList<>();
        BookService bookService = new BookService(booksList);

        bookService.addBook(book01);
        bookService.addBook(book02);
        bookService.addBook(book03);

        for (Map.Entry<Genre, String> pair : bookService.getParGS().entrySet()) {
            System.out.println(pair.getKey() + "->" + pair.getValue());
        }
    }
}
