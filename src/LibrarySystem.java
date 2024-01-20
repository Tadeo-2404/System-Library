import java.util.Scanner;
import functions.Functions;

public class LibrarySystem {
    public static void main(String[] args) {
        Functions functions = new Functions();
        System.out.println("Welcome to the System Library");

        int option;

        do {
            System.out.println("1) Add Book");
            System.out.println("2) Register Member");
            System.out.println("3) Borrow Book");
            System.out.println("4) Return Book");
            System.out.println("5) Display available Books");
            System.out.println("6) Display borrowed Books");
            System.out.println("0) Exit");
            System.out.println("Select an option: ");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("You choose option 'Add Book'");
                    functions.addBook();
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
                    functions.showLibraryBooks();
                    break;
                }
                case 6: {
                    System.out.println("You choose option 'Display borrowed Books'");
                    break;
                }
            }
        } while (option != 0);
    }
}