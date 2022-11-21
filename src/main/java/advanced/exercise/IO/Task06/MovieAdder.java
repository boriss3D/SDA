package advanced.exercise.IO.Task06;

import lombok.Getter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
public class MovieAdder implements Serializable {
    private final List<Movie> list = new ArrayList<>();

    public void addMovie(Movie movie) {
        list.add(movie);
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/advanced/exercise/IO/Task06/movies.txt");
             ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)) {
            out.writeObject(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}