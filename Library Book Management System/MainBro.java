import java.util.Scanner;

/*
    --> Practice exam project (same difficulty/style, different theme)
    --> Theme: Library Book Management System (Console, Java)

    --> You will build a program that lets the user:
     1) enter books
     2) store them in an array
     3) display all books
     4) display “popular” books (rating threshold)
     5) calculate average rating
     6) search by title
     7) prevent duplicate titles
     8) use classes, constructors, getters/setters, instance methods, static utility methods, and method overloading
*/
 public class MainBro {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("How many books ? : ");
         int n = scanner.nextInt();
         scanner.nextLine();
         Book[] books = new Book[n];
         for(int i = 0; i < n; i++) {
             System.out.println("\nBook # : " + (i + 1));
             String title;
             while(true) {
                 System.out.print("Title : ");
                 title = scanner.nextLine().trim();

                 boolean duplicate = false;
                 for(int j = 0; j < i; j++) {
                     if(books[j] != null && books[j].getTitle().equalsIgnoreCase(title)) {
                         duplicate = true;
                         break;
                     }
                 }
                 if(!duplicate) break;
                 System.out.println("Error : title already existed");
             }
             System.out.print("Author : ");
             String author = scanner.nextLine();

             System.out.print("Year : ");
             int year = scanner.nextInt();

             System.out.print("Rating (0.0 - 5.0) : ");
             double rating = scanner.nextDouble();
             scanner.nextLine();

             books[i] = new Book(title, author, year, rating);
         }
         System.out.println("\n --- All books --- ");
         for(int i = 0; i < books.length ; i++ ) {
             books[i].displayInfo();
         }
         scanner.close();
     }
 }

 class Book {
     private String title;
     private String author;
     private int year;
     private double rating;

     public Book(String title, String author, int year) {
         this.title = title;
         this.author = author;
         this.year = year;
         this.rating = 0.0;
     }

     public Book(String title, String author, int year, double rating) {
         this.title = title;
         this.author = author;
         this.year = year;
         setRating(rating);
     }

     public String getTitle() { return title; }
     public String getAuthor() { return author; }
     public int getYear() { return year; }
     public double getRating() { return rating; }

     public void setRating(double rating) {
         if (rating >= 0.0 && rating <= 5.0) {
             this.rating = rating;
         }
     }

     public void displayInfo() {
         System.out.println(title + " | " + author + " | " + year + " | " + rating);
     }

     public boolean isPopular() {
         return rating >= 4.2;
     }
 }


