package advanced.exercise.ClassesAndInterfaces.Task02;

import lombok.Data;

@Data
public class Movie {
    private String title;
    private String director;
    private String yearOfRelease;
    private String genre;
    private String distributor;

    static class MovieCreator {
        private String title;
        private String director;
        private String yearOfRelease;
        private String genre;
        private String distributor;

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setYearOfRelease(String yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
            return this;
        }

        public MovieCreator setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieCreator setDistributor(String distributor) {
            this.distributor = distributor;
            return this;
        }

        public Movie createMovie() {
            Movie movie = new Movie();
            movie.setTitle(title);
            movie.setDirector(director);
            movie.setYearOfRelease(yearOfRelease);
            movie.setGenre(genre);
            movie.setDistributor(distributor);
            return movie;
        }
    }
}
