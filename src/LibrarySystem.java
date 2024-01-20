import java.util.Scanner;
import classes.Book;
import classes.Member;
import classes.Library;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Welcome to the System Library");
        System.out.println("1) Add Book");
        System.out.println("2) Register Member");
        System.out.println("3) Borrow Book");
        System.out.println("4) Return Book");
        System.out.println("5) Display available Books");
        System.out.println("6) Display borrowed Books");
        System.out.println("Select an option: ");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        switch (option) {
            case 1: {
                System.out.println("You choose option 'Add Book'");
                break;
            }
            case 2: {
                System.out.println("You choose option 'Register Member'");
                break;
            }
            case 3: {
                System.out.println("You choose option 'Borrow Book'");
                break;
            }
            case 4: {
                System.out.println("You choose option 'Return Book'");
                break;
            }
            case 5: {
                System.out.println("You choose option 'Display available Books'");
                break;
            }
            case 6: {
                System.out.println("You choose option 'Display borrowed Books'");
                break;
            }
        }
    }
}
