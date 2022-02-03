package homeWork;

import java.util.Objects;

public class Book {
    private String bookName;
    private Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return "Название книги - " + this.bookName +"." + authorName + ". год издания - " + this.publishingYear;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book a = (Book) other;
        return bookName.equals(a.bookName);

    }

    public int hashCode() {
        return Objects.hash(bookName, authorName, publishingYear);
    }
}
