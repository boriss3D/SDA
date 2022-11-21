package advanced.exercise.IO.Task06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

public class MovieGetter implements Serializable {

    public List<Movie> getMovieList() {
        MovieAdder movieAdder;
        try(FileInputStream fileIn = new FileInputStream("src/main/java/advanced/exercise/IO/Task06/movies.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn)) {
            movieAdder = (MovieAdder)in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return movieAdder.getList();
    }
}
