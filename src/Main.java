public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King");
        Book book1 = new Book("IT", author1, 1986);
        System.out.println("Название кники " + book1.getBookName());
        System.out.println("Автор " + book1.getAuthor());
        System.out.println("Издана в " + book1.getPublishedYear());

        Author author2 = new Author("Stephen", "King");
        Book book2 = new Book("The Shining", author2,1977);
        System.out.println("Название кники " + book2.getBookName());
        System.out.println("Автор " + book2.getAuthor());
        System.out.println("Издана в " + book2.getPublishedYear());

        book1.setPublishedYear(1987);
        System.out.println("Обновленная дата публикации " + book1.getPublishedYear());


    }
}