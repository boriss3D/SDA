package advanced.exercise.IO.Task06;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Movie movie01 = new Movie("Star Wars", "Adventure", "George Lucas", "1977");
        Movie movie02 = new Movie("The Empire Strikes Back", "Adventure", "George Lucas", "1980");
        addingObjects(movie01);
        addingObjects(movie02);

        System.out.println(returningObjectLists());
    }

    public static void addingObjects(Movie movie) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/IO/Task06/movies.txt");
             ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)) {
            out.writeObject(movie);
        } catch (Exception e) {
            System.out.println("Something went wrong! ©Microsoft");
        }
    }

    public static List<Movie> returningObjectLists() {
        List<Movie> list = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream("src/IO/Task06/movies.txt");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Movie movie;
            movie = (Movie) in.readObject();
            list.add(movie);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
