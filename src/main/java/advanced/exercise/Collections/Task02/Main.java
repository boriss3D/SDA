package advanced.exercise.Collections.Task02;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Author author01 = new Author("J. K.",  "Rowling", "women");
        Author author02 = new Author("Edgar Rice",  "Burroughs", "men");

        ArrayList<Author> list01 = new ArrayList<>();
        list01.add(author01);
        ArrayList<Author> list02 = new ArrayList<>();
        list02.add(author02);


        Book book01 = new Book("Harry Potter and the Philosopher's Stone", 10.0,
                LocalDate.of(1997, 2, 22), list01, Genre.FANTASY);
        Book book02 = new Book("Harry Potter and the Chamber of Secrets", 11.0,
                LocalDate.of(2000, 3, 2), list01, Genre.FANTASY);
        Book book03 = new Book("Tarzan", 9.0,
                LocalDate.of(1912, 8, 15), list02 , Genre.ROMANCE);

        ArrayList<Book> booksList = new ArrayList<>();
        BookService bookService = new BookService(booksList);

        bookService.addBook(book01);
        bookService.addBook(book02);
        bookService.addBook(book03);
        System.out.println();

        bookService.removeBook(book01);
        System.out.println();

        bookService.addBook(book01);
        for(Book book : bookService.books()){
            System.out.println(book);
        }
        System.out.println();

        for(Book book : bookService.getBooksFantasy()){
            System.out.println(book);
        }
        System.out.println();

        for(Book book : bookService.getBooksBefore1999()) {
            System.out.println(book);
        }
        System.out.println();

        System.out.println("most expensive -> " + bookService.getMostExpensiveBook());
        System.out.println();

        System.out.println("cheapest -> " + bookService.getCheapestBook());
        System.out.println();

        String output = bookService.getBookWithThreeAuthors() != null ? bookService.getBookWithThreeAuthors().toString()
                : "No such book";
        System.out.println("3 Authors -> " + output);
        System.out.println();

        for (Book book : bookService.getSortedListAscending()) {
            System.out.println(book);
        }
        System.out.println();

        for (Book book : bookService.getSortedListDescending()) {
            System.out.println(book);
        }
        System.out.println();

        System.out.println(book01.getTitle() + " is in the list -> " + bookService.isInTheList(book01));
        System.out.println();

        for (Book book : bookService.getBooksByAuthor("Rowling")) {
            System.out.println(book.getTitle());
        }
        System.out.println();
    }
}
