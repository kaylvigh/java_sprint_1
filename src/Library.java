import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private static ArrayList<Book> books;
    public static void main(String[] args) {
        books = new ArrayList();
        System.out.println("Welcome to our Library.");
        promptUser();
    }
    public static void promptUser(){
        try{
            System.out.println("Are you? 1) librarian 2) patron.");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice ==1){
                promptLibrarian();
            }else if (choice == 2) {
                System.out.println("What would you like to do?");
            } else {
                System.out.println("Invalid input.");
                promptUser();
            }
        } catch(Exception e){
            System.out.println("Invalid input.");
            promptUser();
        }
    }
    public static void promptLibrarian() {
        try {
            System.out.println("What would you like to do?");
            System.out.println("1) Add Book.");
            System.out.println("2) Edit Book.");
            System.out.println("3) Delete Book.");
            System.out.println("4) Add Author.");
            System.out.println("5) Edit Author.");
            System.out.println("6) Delete Author.");
            System.out.println("7) Print all books.");
            System.out.println("8) Exit.");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    editBook();
                    break;
                case 7:
                    printAll();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid input.");
            }
        } catch (Exception e){
            System.out.println("Invalid input.");
            promptLibrarian();
        }
        promptLibrarian();
    }

    private static void printAll() {
        for(int i = 0; i < books.size(); i++){
            System.out.println(books.get(i));
        }
    }


    private static void editBook() {
    }

    private static void addBook() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("What is the title of the book?");
            String title = input.next();
            System.out.println("What is the name of the author?");
            String author = input.next();
            System.out.println("What is the ISBN?");
            String isbn = input.next();
            System.out.println("Who is the publisher?");
            String publisher = input.next();
            System.out.println("How many copies are there?");
            int numOfCopies = input.nextInt();
            Book book = new Book(title, author, isbn, publisher, numOfCopies);
            Library.addBook(book);
            System.out.println("Book has been created successfully.");
        } catch (Exception e) {
            System.out.println("Invalid input.");
            addBook();
        }
    }

    public Book search(String key, String query){
        return null;
    }
    public static void addBook(Book newBook){
        books.add(newBook);
    }
}
