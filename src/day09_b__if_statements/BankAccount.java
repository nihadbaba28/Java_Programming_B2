package day09_b__if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance? ");   // --> 100_000
        double balance = input.nextDouble();
        System.out.println("How much do you want to withdraw? "); //--> 10_000
        double withdraw = input.nextDouble();
        balance -= withdraw;

        if(balance < 0) {
            System.out.println("You took out too much. ");
            System.out.println("You owe us: " + balance);
        } else {
            System.out.println("Your new balance is $" +balance);
        }
    }
}
