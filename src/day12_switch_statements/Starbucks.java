package day12_switch_statements;

import java.util.Scanner;

public class Starbucks {
    /*

Declare price and calories variables

Ask the user to enter which size drink they want

Based on the drink size determine the price and calories of the order

At the end print the details of the order

    data:

        size: tall
        price: 2.50
        calories: 100

        size: grande
        price: 4.00
        calories: 150

        size: venti
        price: 4.50
        calories: 200

 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // ini
        System.out.print("What size of drink do you want?: ");
        String size = input.next();
        double price = 0;
        int calories = 0;
        boolean isValid = true;
        switch (size){
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("qaqa coffe qutaribee");
                isValid = false;
        }
        if (isValid){
        System.out.println("Your order for " + size + " size price is " + price + "\n\t it has " + calories + " calories");



    }
}}
