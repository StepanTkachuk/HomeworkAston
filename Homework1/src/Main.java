public class Main {
    public static void main(String[] args) {
        Book book4 = new Book("Капитанская дочка", "Пушкин", 1836 ,true);
        Book book5 = new Book("Мёртвые души", "Гоголь");
        Library library1 = new Library();
        library1.printAvailableBooks();
        library1.returnBook(book4);
        library1.returnBook(book5);
        library1.printAvailableBooks();
        library1.borrowBook(book4);
        library1.printAvailableBooks();
        System.out.println(library1.findBooksByAuthor("Толстой"));
    }
}