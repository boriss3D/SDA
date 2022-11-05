package advanced.exercise.ClassesAndInterfaces.Task02;

public class Main {
    public static void main(String[] args) {
        Movie.MovieCreator movieCreator = new Movie.MovieCreator()
                .setTitle("Harry Potter and the Sorcerer's Stone")
                .setDirector("Chris Columbus")
                .setYearOfRelease("2001")
                .setGenre("Fantasy")
                .setDistributor("HolyWood");

        Movie movie = movieCreator.createMovie();
        System.out.println(movie);
    }
}
