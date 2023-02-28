import java.util.ArrayList;

public class Author {
    String name;
    String dateOfBirth;
    ArrayList<Book> books;
    public Author(String name, String dateOfBirth, ArrayList<Book> books){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.books = books;
    }
}
