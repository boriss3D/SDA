package advanced.exercise.Exceptions.Task02;

import java.util.ArrayList;

public class BookRepository {
    private final ArrayList<Book> arrayList;

    public BookRepository() {
        arrayList = new ArrayList<>();
    }

    public ArrayList<Book> getArrayList() {
        return arrayList;
    }

    public void addBook(Book book) {
        arrayList.add(book);
    }

    public void removeBook(Book book) {
        if (arrayList.remove(book)) {
            System.out.println("Removed -> " + book.getTitle());
        } else {
            System.out.println("We do not have -> " + book.getTitle());
        }
    }

    public void searchByBookTitle(String title) throws NoBookFoundException {
        boolean isFound = false;
        for (Book book : arrayList) {
            if (book.getTitle().equals(title)) {
                isFound = true;
                System.out.println("We have book with title -> " + title);
                break;
            }
        }
        if (!isFound) {
            throw new NoBookFoundException(title + " is not found.");
        }
    }

    public void searchByBookID(int id) throws NoBookFoundException {
        boolean isFound = false;
        for (Book book : arrayList) {
            if (book.getId() == id) {
                isFound = true;
                System.out.println("We have book with id -> " + id);
                break;
            }
        }
        if (!isFound) {
            throw new NoBookFoundException(id + " is not found.");
        }
    }

    public void removeBookByID(int id) {
        boolean isFound = false;
        for(Book book : arrayList) {
            if(book.getId() == id) {
                isFound = true;
                arrayList.remove(book);
                System.out.println("Book with " + book.getId() + " was removed.");
                break;
            }
        }
        if(!isFound){
            System.out.println("No book with ID -> " + id);
        }
    }
}
