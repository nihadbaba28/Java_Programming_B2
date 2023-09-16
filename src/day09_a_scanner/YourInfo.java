package day09_a_scanner;
import java.util.Scanner;
public class YourInfo {
       /*
        Ask the user to enter their age (byte),
        ask them to enter their favorite number (long),
        and ask them to enter their favorite book
        Print all the values from the inputs
     */
       public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
           System.out.println("Enter your age: ");
           byte age = input.nextByte();
           System.out.println("Enter your favorite number: ");
           long favoriteNumber = input.nextLong();
           System.out.println("Enter your favorite book: ");
           String favoriteBook = input.next();
           System.out.println("Your age: " + age);
           System.out.println("Your favorite number: " + favoriteNumber);
           System.out.println("Your favorite book: " + favoriteBook);
       }
}
