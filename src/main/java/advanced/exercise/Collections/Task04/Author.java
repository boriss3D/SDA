package advanced.exercise.Collections.Task04;

import java.util.Objects;

public class Author {
    private final String name;
    private final String lastName;
    private final String gender;

    public Author(String name, String lastName, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName) && Objects.equals(gender, author.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, gender);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
