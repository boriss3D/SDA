package advanced.exercise.Collections.Task04;

import java.util.*;

public record BookService(ArrayList<Book> books) {

    void addBook(Book book) {
        books.add(book);
    }

    Map<Genre, String> getParGS() {
        Map<Genre, String> pairs = new HashMap<>();
        for (Book book : books) {
            pairs.put(book.getGenre(), book.getTitle());
        }
        return pairs;
    }
}
