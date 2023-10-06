package day17_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = 77;
        int guess;
        do {
            System.out.println("Guess a number from 1 - 100: ");
             guess = input.nextInt();
             if(guess > secretNumber){
                 System.out.println("That is too high, try again");
             }
             if(guess < secretNumber){
                 System.out.println("That is less try again");
             }
        } while (guess != secretNumber);

        System.out.println("You got it");
    }
}
