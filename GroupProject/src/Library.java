import java.util.*; // java package used to access the ArrayList
public class Library {
    String name; // instance variable
    ArrayList<Book> books; //instance variable

    Library(String name){       //This is a constructor of the class library
        this.name=name;
        this.books= new ArrayList<Book>();
    }

    void addBook(Book books){ //method of the class
        this.books.add(books);
    }
    void removeBook(Book books){
        this.books.remove(books);
    } //method of the class

}
