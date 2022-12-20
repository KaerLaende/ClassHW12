import java.util.Objects;

public class Books {
    private Author authorName;
    private String bookName;
    private int publishingYear;

    @Override
    public boolean equals(Object book) {
        if (this == book) return true;
        if (book == null || getClass() != book.getClass()) return false;
        Books books = (Books) book;
        return publishingYear == books.publishingYear && authorName.equals(books.authorName) && bookName.equals(books.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName, publishingYear);
    }

    public Author getAuthorName() {
        return authorName;
    }


    public String getBookName() {
        return bookName;
    }


    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return "Книга: " + authorName + ", название книги " + bookName +
                ", год публикации = " + publishingYear + " год.";
    }

    public Books(Author authorName, String bookName, int publishingYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }
}
