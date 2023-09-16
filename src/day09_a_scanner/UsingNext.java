package day09_a_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("What is today? ");
        String day = input.nextLine();
        System.out.println("Enter your first name: ");
        String name = input.next();
        System.out.println("Today is? " + day);
        System.out.println("What is your first name? "+ name);
    }
}
