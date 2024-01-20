package classes;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private String genre;
    private boolean available;

    //CONSTRUCTOR
    public Book(String ISBN, String title, String author, String genre, boolean available) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    };
    //GET ISBN
    public String getISBN() {
        return this.ISBN;
    };
    //GET TITLE
    public String getTitle() {
        return this.title;
    };
    //GET AUTHOR
    public String getAuthor() {
        return this.author;
    };
    //GET GENRE
    public String getGenre() {
        return this.genre;
    };
    //GET AVAILABLE
    public boolean getAvailable() {
        return this.available;
    };

    //SET ISBN
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    //SET AUTHOR
    public void setAuthor(String author) {
        this.author = author;
    }
    //SET TITLE
    public void setTitle(String title) {
        this.title = title;
    }
    //SET GENRE
    public void setGenre(String genre) {
        this.genre = genre;
    }
    //SET AVAILABLE
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
