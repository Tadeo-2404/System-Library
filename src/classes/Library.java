package classes;
import java.util.ArrayList;
import java.util.List;

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
    public void setBorrowedBooks(Book book) {
        this.books.add(book);
    }
    //set members
    public void setMembers(Member member) {
        this.members.add(member);
    }
}