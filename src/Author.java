import java.util.Objects;

public class Author {
    private final String authorFirstName;
    private final String authorLastName;

    public Author(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    public String getAuthorFullName() {
        return authorFirstName + authorLastName;
    }
    // Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке.
    // Обратите внимание, что toString книги не должен дублировать код из toString автора,
    // а должен делегировать (вызывать) его версию метода.
    @Override
    public String toString() {
        return authorFirstName + " " + authorLastName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorFirstName, author.authorFirstName) && Objects.equals(authorLastName, author.authorLastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorLastName);
    }
}
