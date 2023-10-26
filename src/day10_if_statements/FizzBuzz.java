package day10_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();

        String result = "";
        if (number % 3 == 0 && number % 5 ==0){
            result = "FizzBuzz";
        }
        if (number % 3 == 3){
            result = "Fizz";
        }
        if (number % 5 == 0){
            result = "Buzz";
        }
        System.out.println(result);
    }
}
