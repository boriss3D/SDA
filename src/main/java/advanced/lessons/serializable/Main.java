package advanced.lessons.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            bookList.add(new Book(i, "title " + i, "author " + i));
        }

        FileOutputStream fileOutputStream = new FileOutputStream("books.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (int i = 0; i < 10; i++) {
            objectOutputStream.writeObject(bookList.get(i));
        }

        objectOutputStream.close();

    }

}
