import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "автор книги - " + surname + ' ' + name;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    @Override

    public boolean equals(Object author) {
        if (this == author) return true;
        if (author == null || getClass() != author.getClass()) return false;
        Author author = (Author) author;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

}
