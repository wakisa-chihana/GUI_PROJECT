// below is the class brok
public class Book {
    String author; //instance variable
    String title; //instance variable
    String ISBN;//instance variable
    String publicationYear;//instance variable
    String availableCopies;//instance variable
    String totalCopies;//instance variable

    Book( String author, String text1, String text3, String text5, String text7, String text9){ //class constructor
        this.author=author;
        this.title=text1;
        this.ISBN=text3;
        this.publicationYear=text5;
        this.availableCopies=text7;
        this.totalCopies=text9;

    }
     public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublishingYear() {
        return publicationYear;
    }

    public String getCopiesAvailable() {
        return availableCopies;
    }

    public String getTotalCopies() {
        return totalCopies;
    }
    
}
