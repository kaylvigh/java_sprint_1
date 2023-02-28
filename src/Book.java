public class Book implements Borrowable{
    String title;
    String author;
    String isbn;
    String publisher;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numOfCopies=" + numOfCopies +
                '}';
    }

    int numOfCopies;
    public Book(String title, String author, String isbn, String publisher, int numOfCopies){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.numOfCopies = numOfCopies;
    }
    @Override
    public void borrowBook() {

    }

    @Override
    public void returnBook() {

    }


}
