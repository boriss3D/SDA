package advanced.exercise.IO.Task06;

import lombok.Data;

import java.io.Serializable;
@Data
public class Movie implements Serializable {
    private final String title;
    private final String genre;
    private final String director;
    private final String yearOfRelease;
}