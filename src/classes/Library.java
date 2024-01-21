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
        boolean found = false;
        for(Book book: books) {
            if(book.getISBN() == ISBN) {
                found = true;
                return book;
            }
        }
        return null;
    }
    //search books by ISBN
    public void searchBookByISBN(String ISBN) {
        boolean found = false;
        for(Book book: books) {
            if(book.getISBN() == ISBN) {
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
            if(book.getTitle() == title) {
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
            if(book.getAuthor() == author) {
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
            if(book.getGenre() == genre) {
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
            System.out.println("Book by available " + available + " not found");
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

            switch (option) {
                case 1: {
                    System.out.println("Insert new title:");
                    String newTitle = scan.nextLine();
                    bookExist.setTitle(newTitle);
                    break;
                }
                case 2: {
                    System.out.println("Insert new author:");
                    String newAuthor = scan.nextLine();
                    bookExist.setAuthor(newAuthor);
                    break;
                }
                case 3: {
                    System.out.println("Insert new genre:");
                    String newGenre = scan.nextLine();
                    bookExist.setGenre(newGenre);
                    break;
                }
                case 4: {
                    System.out.println("Insert new availability:");
                    boolean newAvailability = scan.nextBoolean();
                    bookExist.setAvailable(newAvailability);
                    break;
                }
                case 5: {
                    break;
                }
            }
        }
    }
}