package classes;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private List<Book> borrowedBooks;
    //Constructor
    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    //get memberId
    public String getMemberId() {
        return memberId;
    }
    //get name
    public String getName() {
        return name;
    }
    //get borrowed books
    public void getBorrowedBooks() {
        System.out.println("Borrowed books by " + name + ":");
        for (Book book : borrowedBooks) {
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Genre: " + book.getGenre());
            System.out.println("Available: " + book.getAvailable());
        }
    }
    //get amount borrowed books
    public int getAmountBorrowedBooks() {
        if(this.borrowedBooks != null) {
            return this.borrowedBooks.size();
        } else {
            return 0;
        }
    }
    //get borrowed book by ISBN
    public Book getBookByISBN(String ISBN) {
        for(Book book: this.borrowedBooks) {
            if(book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
    //set name
    public void setName(String name) {
        this.name = name;
    }
    //set member id
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    //set borrowed books
    public void setBorrowedBooks(Book book) {
        this.borrowedBooks.add(book);
    }
    //delete borrowed book
    public void deleteBorrowedBook(String ISBN) {
        Book bookExist = getBookByISBN(ISBN);

        if (bookExist != null) {
            boolean deleted = this.borrowedBooks.removeIf(book -> book.getISBN().equals(ISBN));

            if (!deleted) {
                System.out.println("Book with ISBN '" + ISBN + "' could not be returned");
            } else {
                System.out.println("Book with ISBN '" + ISBN + "' returned successfully");
            }
        } else {
            System.out.println("Book with ISBN '" + ISBN + "' not found");
        }
    }
}
