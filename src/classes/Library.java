package classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<Book>();
        this.members = new ArrayList<Member>();
    }
    //get books
    public void getBooks() {
        for (Book book : books) {
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Genre: " + book.getGenre());
            System.out.println("Available: " + book.getAvailable());
        }
    }
    //get members
    public void getMembers() {
        for (Member member : members) {
            System.out.println("ID: " + member.getMemberId());
            System.out.println("Name: " + member.getName());
            member.getBorrowedBooks();
        }
    }
    //set books
    public void setBooks(Book book) {
        this.books.add(book);
    }
    //set members
    public void setMembers(Member member) {
        this.members.add(member);
    }
    //search book
    public Book searchBook(String ISBN) {
        for(Book book: books) {
            if(book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
    //search books by ISBN
    public void searchBookByISBN(String ISBN) {
        boolean found = false;
        for(Book book: books) {
            if(book.getISBN().equals(ISBN)) {
                found = true;
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Genre: " + book.getGenre());
                System.out.println("Available: " + book.getAvailable());
            }
        }

        if(!found) {
            System.out.println("Book by ISBN " + ISBN + " not found");
        }
    }
    //search book by title
    public void searchBooksByTitle(String title) {
        boolean found = false;
        for(Book book: books) {
            if(book.getTitle().equals(title)) {
                found = true;
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Genre: " + book.getGenre());
                System.out.println("Available: " + book.getAvailable());
            }
        }

        if(!found) {
            System.out.println("Book by title " + title + " not found");
        }
    }
    //search book by author
    public void searchBooksByAuthor(String author) {
        boolean found = false;
        for(Book book: books) {
            if(book.getAuthor().equals(author)) {
                found = true;
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Genre: " + book.getGenre());
                System.out.println("Available: " + book.getAvailable());
            }
        }

        if(!found) {
            System.out.println("Book by author " + author + " not found");
        }
    }
    //search book by genre
    public void searchBooksByGenre(String genre) {
        boolean found = false;
        for(Book book: books) {
            if(book.getGenre().equals(genre)) {
                found = true;
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Genre: " + book.getGenre());
                System.out.println("Available: " + book.getAvailable());
            }
        }

        if(!found) {
            System.out.println("Book by genre " + genre + " not found");
        }
    }
    //search book by availability
    public void searchBooksByAvailability(boolean available) {
        boolean found = false;
        for(Book book: books) {
            if(book.getAvailable() == available) {
                found = true;
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Genre: " + book.getGenre());
                System.out.println("Available: " + book.getAvailable());
            }
        }

        if(!found) {
            System.out.println("Book by availability " + available + " not found");
        }
    }
    //edit book
    public void editBook(String ISBN) {
        Book bookExist = searchBook(ISBN);
        Scanner scan = new Scanner(System.in);

        if(bookExist != null) {
            System.out.println("1) Edit title");
            System.out.println("2) Edit author");
            System.out.println("3) Edit genre");
            System.out.println("4) Edit availability");
            System.out.println("5) Exit");
            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1: {
                    System.out.println("Insert new title:");
                    String newTitle = scan.nextLine();
                    bookExist.setTitle(newTitle);
                    System.out.println("Title updated to: " + bookExist.getTitle());
                    break;
                }
                case 2: {
                    System.out.println("Insert new author:");
                    String newAuthor = scan.nextLine();
                    bookExist.setAuthor(newAuthor);
                    System.out.println("Author updated to: " + bookExist.getAuthor());
                    break;
                }
                case 3: {
                    System.out.println("Insert new genre:");
                    String newGenre = scan.nextLine();
                    bookExist.setGenre(newGenre);
                    System.out.println("Genre updated to: " + bookExist.getGenre());
                    break;
                }
                case 4: {
                    System.out.println("Insert new availability:");
                    boolean newAvailability = scan.nextBoolean();
                    bookExist.setAvailable(newAvailability);
                    System.out.println("Availability updated to: " + bookExist.getAvailable());
                    break;
                }
                case 5: {
                    break;
                }
            }
        } else {
            System.out.println("Book with ISBN '" + ISBN + "' not found");
            return;
        }
    }
    //delete book
    public void deleteBook(String ISBN) {
        Book bookExist = searchBook(ISBN);

        if (bookExist != null) {
            boolean deleted = books.removeIf(book -> book.getISBN().equals(ISBN));

            if (!deleted) {
                System.out.println("Book with ISBN '" + ISBN + "' could not be deleted");
            } else {
                System.out.println("Book with ISBN '" + ISBN + "' deleted successfully");
            }
        } else {
            System.out.println("Book with ISBN '" + ISBN + "' not found");
        }
    }
}