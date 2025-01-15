import java.sql.SQLOutput;

public class Book {
    
    public int rating;
    public String title;
    public String author;
    
    public Book(int pRating){
        title = "Stay Hungry";
        author = "Sebastian Maniscalco";
        rating = pRating;


print();
    }

    public void print(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("rating:" + rating);
        //TODO: use System.out to print the values of the
        //      instance varibles so the user can see the review


    }

    
}