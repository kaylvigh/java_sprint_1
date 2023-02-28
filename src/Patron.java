import java.util.ArrayList;

public class Patron {
    String name;
    String address;
    String phoneNumber;
    ArrayList<Book> borrowed;
    public Patron(String name, String address, String phoneNumber, ArrayList<Book> borrowed) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowed = borrowed;
    }
}
