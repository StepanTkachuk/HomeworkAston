public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void borrowBook() {
        this.isAvailable = false;
    }

    void returnBook() {
        this.isAvailable = true;
    }

    void displayInfo() {
        System.out.println("Название книги " + this.title + " Автор книги " + this.author +
                " Год написания " + this.year + " Статус доступности " + this.isAvailable);
    }

}
