package advanced.exercise.Generics.Task04;

public class Main {
    public static void main(String[] args) {
        Library<Media> library = new Library<>();

        Book book = new Book("Harry Potter and the Philosopher's Stone");
        Movie movie = new Movie("Harry Potter and the Chamber of Secrets");
        Newspaper newspaper = new Newspaper("3d-news");

        library.addMedia(book);
        library.addMedia(movie);
        library.addMedia(newspaper);

        library.getAll();
    }
}
