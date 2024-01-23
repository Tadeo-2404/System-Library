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
    //search book function
    public static void searchLibraryBook() {
        System.out.println("1) Search by ISBN");
        System.out.println("2) Search by title");
        System.out.println("3) Search by author");
        System.out.println("4) Search by genre");
        System.out.println("5) Search by availability");
        System.out.println("6) Exit");
        System.out.println("Insert option: ");
        int option = scan.nextInt();
        scan.nextLine();

        switch (option) {
            case 1: {
                System.out.println("Search book by ISBN");
                System.out.println("Insert ISBN:");
                String ISBN = scan.nextLine();
                library.searchBookByISBN(ISBN);
                break;
            }
            case 2: {
                System.out.println("Search book by title");
                System.out.println("Insert title:");
                String title = scan.nextLine();
                library.searchBooksByTitle(title);
                break;
            }
            case 3: {
                System.out.println("Search book by author");
                System.out.println("Insert author:");
                String author = scan.nextLine();
                library.searchBooksByAuthor(author);
                break;
            }
            case 4: {
                System.out.println("Search book by genre");
                System.out.println("Insert genre:");
                String genre = scan.nextLine();
                library.searchBooksByGenre(genre);
                break;
            }
            case 5: {
                System.out.println("Search book by availability");
                System.out.println("Insert availability:");
                boolean availability = scan.nextBoolean();
                library.searchBooksByAvailability(availability);
                break;
            }
            case 6: {
                break;
            }
            default: {
                System.out.println("Invalid option: it must be from 1-6");
                break;
            }
        }
    }
    //show books function
    public static void showLibraryBooks() {
        library.getBooks();
    }
    //edit book function
    public static void editLibraryBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert ISBN of the book to edit: ");
        String ISBN = input.nextLine();
        library.editBook(ISBN);
    }
    //delete book function
    public static void deleteLibraryBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert ISBN of the book to delete: ");
        String ISBN = input.nextLine();
        library.deleteBook(ISBN);
    }
}
