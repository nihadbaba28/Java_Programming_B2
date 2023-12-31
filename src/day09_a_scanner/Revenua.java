package day09_a_scanner;

import java.util.Scanner;

public class Revenua {
    /* Write a program that asks the user to enter a price and quantity and then calculate the revenue.
    Calculation : revenue = price x quantity
     */
public static void main(String[] args){
   // 1) First I need to import the package that has the Scanner class in it
    // 2) Then I need to create an OBJECT of the Scanner class
    // *) If I want to use a class from a different package, I need to import it
    // *) If I want to use anything from that class, I need to create a object of it

    Scanner input = new Scanner(System.in);  // input ---> is a reference to the object
    System.out.println("Enter the price: $");
    double price = input.nextDouble();
    System.out.println("Enter the quantity: ");
    int quantity = input.nextInt();

    double revenue = price * quantity;
    System.out.println("Revenue: $" + revenue);
}
}
