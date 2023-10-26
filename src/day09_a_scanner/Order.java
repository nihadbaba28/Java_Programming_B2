package day09_a_scanner;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a product name: ");
        String productName = input.nextLine();
        System.out.println("Enter the price for " + productName + ": $");
        double price = input.nextDouble();
        System.out.println("How many " + productName + " do you want to buy? ");
        int quantity = input.nextInt();
        System.out.println("What is your full name ? ");
        input.nextLine();
        String fullName = input.nextLine();
        System.out.println(fullName + " your order for " + quantity + " " + productName + " has been placed.\nYour total is " + price * quantity);


    }
}
