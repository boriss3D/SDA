package advanced.exercise.IO.Task06;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        MovieAdder movieAdder = new MovieAdder();
        MovieGetter movieGetter = new MovieGetter();

        Movie movie01 = new Movie("Star Wars", "Adventure", "George Lucas", "1977");
        Movie movie02 = new Movie("The Empire Strikes Back", "Adventure", "George Lucas", "1980");
        Movie movie03 = new Movie("Return of the Jedi", "Adventure", "George Lucas", "1983");

        System.out.println("First two movies added...");
        movieAdder.addMovie(movie01);
        movieAdder.addMovie(movie02);
        movieGetter.getMovieList().forEach(System.out::println);
        System.out.println();
        System.out.println("Third movie added...");
        movieAdder.addMovie(movie03);
        movieGetter.getMovieList().forEach(System.out::println);
    }
}
