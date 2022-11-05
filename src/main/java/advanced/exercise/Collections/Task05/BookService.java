package advanced.exercise.Collections.Task05;

import java.util.*;

public record BookService(ArrayList<Book> books) {

    public void addBook(Book book) {
        if (books.add(book)) {
            System.out.println("added -> " + book.toString());
        }
    }

    public Stack<Book> getPriceStack() {
        TreeMap<Double, Book> treeMap= new TreeMap<>();
        for (Book book : books) {
            treeMap.put(book.getPrice(), book);
        }
        Stack<Book> stack = new Stack<>();
        for(Book book : treeMap.values()) {
            stack.add(0, book);
        }
        return stack;
    }
}
