package advanced.exercise.IO.Task06;

import java.io.Serializable;

public class Movie implements Serializable {
    private final String title;
    private final String genre;
    private final String director;
    private final String yearOfRelease;

    public Movie(String title, String genre, String director, String yearOfRelease) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", yearOfRelease='" + yearOfRelease + '\'' +
                '}';
    }
}
