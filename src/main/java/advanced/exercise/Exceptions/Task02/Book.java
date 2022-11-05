package advanced.exercise.Exceptions.Task02;

public class Book {
    private final int id;
    private final String title;
    private final String author;
    private final String yearOfRelease;

    public Book(int id, String title, String author, String yearOfRelease) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRelease='" + yearOfRelease + '\'' +
                '}';
    }
}
