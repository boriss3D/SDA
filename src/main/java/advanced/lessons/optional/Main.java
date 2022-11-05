package advanced.lessons.optional;

import lombok.Data;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        //assume that we get data from database and not sure if it presents
        Movie movie = null;

        //------Java Fundamentals---------------------
        if (movie == null) {
            System.out.println("movie is null");
        } else {
            System.out.println("Movie title is " + movie.getTitle());
        }

        //if you dont have null check this line throws exception
        //movie.getTitle();
        //---------------------------------------------

        //--------Java Advanced Topics----------------
        Optional<Movie> movieContainer = Optional.ofNullable(movie);
        movieContainer.ifPresent(System.out::println);
        //--------------------------------------

    }

    @Data
    class Movie {
        String title;
    }

}
