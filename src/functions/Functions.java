package functions;
import java.util.Scanner;
import classes.Book;
import classes.Library;

public class Functions {
    static Scanner scan = new Scanner(System.in);
    static Library library = new Library();

    //add book function
    public static void addBook() {
        System.out.println("Insert ISBN of the book");
        String ISBN = scan.nextLine();
        System.out.println("Insert title of the book");
        String title = scan.nextLine();
        System.out.println("Insert author of the book");
        String author = scan.nextLine();
        System.out.println("Insert genre of the book");
        String genre = scan.nextLine();
        System.out.println("Insert availability of the book");
        boolean available = scan.nextBoolean();
        Book book = new Book(ISBN, title, author, genre, available);
        library.setBooks(book);
    }

    public static void searchLibraryBook() {
        System.out.println("1) Search by ISBN");
        System.out.println("2) Search by title");
        System.out.println("3) Search by author");
        System.out.println("4) Search by genre");
        System.out.println("5) Search by availability");
        int option = scan.nextInt();

        switch (option) {
            case 1: {
                System.out.println("Search book by ISBN");
                String ISBN = scan.nextLine();
                library.searchBookByISBN(ISBN);
                break;
            }
        }
    }

    public static void showLibraryBooks() {
        library.getBooks();
    }
}
