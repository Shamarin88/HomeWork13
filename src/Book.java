import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int publishedYear;

    public Book(String bookName, Author author, int publishedYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishedYear = publishedYear;
    }
    public String getBookName() {
        return bookName;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublishedYear() {
        return publishedYear;
    }
    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
    // Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке.
    // Обратите внимание, что toString книги не должен дублировать код из toString автора,
    // а должен делегировать (вызывать) его версию метода.
    @Override
    public String toString() {
        return bookName;
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publishedYear);
    }
    public  boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book1 = (Book) other;
        return equals(book1);
    }
}
