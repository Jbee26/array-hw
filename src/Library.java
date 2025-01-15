import java.sql.SQLOutput;
import java.util.Random;

public class Library {

    public String owner = "Jack B";
    public Book[] allBooks;
    int sum = 0;
    public static void main(String[] args) {
        Library myLibrary = new Library();
    }


    public Library(){

        System.out.println("Welcome to "+ owner + "'s library!!!!!");
        //TODO: Give the array allReviews a size of 10
        allBooks = new Book[10];



        //TODO: Fill the array allReviews with reviews with random ratings from 0 to 10 inclusive

        for (int b = 0; b < allBooks.length; b++){
            allBooks[b] = new Book((int)(Math.random() * 11));
        }




        //TODO: print all the ratings in the array allReviews

        for (int p = 0; p < allBooks.length; p++ ){
            allBooks[p].print();
        }

        //TODO: Call the method averageRating
        averageRating();

    }

    public void averageRating(){
        //TODO: calculate the average rating from the array allReviews and print it


        for (int s = 0; s < allBooks.length; s++){
            sum += allBooks[s].rating;
        }

        double average = (double) sum / allBooks.length;
        System.out.println(average + "= average ");
    }
}
