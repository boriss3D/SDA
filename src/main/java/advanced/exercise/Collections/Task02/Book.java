package advanced.exercise.Collections.Task02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Book {
    private String title;
    private double price;
    private LocalDate YearOfRelease;
    private ArrayList<Author> authorLists;
    private Genre genre;

    public Book() {
    }

    public Book(String title, double price, LocalDate yearOfRelease, ArrayList<Author> authorLists, Genre genre) {
        this.title = title;
        this.price = price;
        YearOfRelease = yearOfRelease;
        this.authorLists = authorLists;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getYearOfRelease() {
        return YearOfRelease;
    }

    public void setYearOfRelease(LocalDate yearOfRelease) {
        YearOfRelease = yearOfRelease;
    }

    public ArrayList<Author> getAuthorLists() {
        return authorLists;
    }

    public void setAuthorLists(ArrayList<Author> authorLists) {
        this.authorLists = authorLists;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", YearOfRelease=" + YearOfRelease +
                ", authorLists=" + authorLists +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && Objects.equals(title, book.title) && Objects.equals(YearOfRelease, book.YearOfRelease) && Objects.equals(authorLists, book.authorLists) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, YearOfRelease, authorLists, genre);
    }
}
