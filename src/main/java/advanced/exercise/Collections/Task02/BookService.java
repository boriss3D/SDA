package advanced.exercise.Collections.Task02;

import java.time.LocalDate;
import java.util.*;

public record BookService(ArrayList<Book> books) {

    void addBook(Book book) {
        if (books.add(book)) {
            System.out.println("added -> " + book.toString());
        }
    }

    void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("removed -> " + book.toString());
        } else {
            System.out.println("No such book");
        }
    }

    public ArrayList<Book> getBooksFantasy() {
        ArrayList<Book> fantasy = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre() == Genre.FANTASY) {
                fantasy.add(book);
            }
        }
        return fantasy;
    }

    public ArrayList<Book> getBooksBefore1999() {
        ArrayList<Book> before1999 = new ArrayList<>();
        LocalDate date1999 = LocalDate.of(1999, 1, 1);
        for (Book book : books) {
            if (book.getYearOfRelease().isBefore(date1999)) {
                before1999.add(book);
            }
        }
        return before1999;
    }

    public Book getCheapestBook() {
        Book cheap = new Book();
        cheap.setPrice(Float.MAX_VALUE);
        for (Book book : books) {
            if (book.getPrice() < cheap.getPrice()) {
                cheap = book;
            }
        }
        return cheap;
    }

    public Book getMostExpensiveBook() {
        Book mostExpensive = new Book();
        mostExpensive.setPrice(Float.MIN_VALUE);
        for (Book book : books) {
            if (book.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }

    private int getNumberOfAuthors(Book book) {
        return book.getAuthorLists().size();
    }

    public Book getBookWithThreeAuthors() {
        for (Book book : books) {
            if (getNumberOfAuthors(book) == 3) {
                return book;
            }
        }
        return null;
    }

    public boolean isInTheList(Book book) {
        for (Book b : books) {
            if (b.equals(book) && b.hashCode() == book.hashCode()) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Book> getBooksByAuthor(String author) {
        ArrayList<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            ArrayList<Author> temp = book.getAuthorLists();
            for (Author author1 : temp) {
                if(author1.getLastName().equals(author)) {
                    authorBooks.add(book);
                }
            }
        }
        return authorBooks;
    }

    public LinkedList<Book> getSortedListAscending() {
        TreeMap<String, Book> treeMap = new TreeMap<>();
        for (Book book : books) {
            treeMap.put(book.getTitle(), book);
        }
        return new LinkedList<>(treeMap.values());
    }

    public LinkedList<Book> getSortedListDescending() {
        TreeMap<String, Book> treeMap = new TreeMap<>();
        LinkedList<Book> list = new LinkedList<>();
        for (Book book : books) {
            treeMap.put(book.getTitle(), book);
        }
        for (Book book : treeMap.values()) {
            list.add(0, book);
        }
        return list;
    }
}
