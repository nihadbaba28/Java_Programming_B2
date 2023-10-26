package day10_if_statements;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = input.nextInt(); // num1 > num2 && num1 >num3
        int num2 = input.nextInt(); // num2 > num1 && num2 > num3
        int num3 = input.nextInt(); // num3 > num1 && num3 > num2
        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is the biggest one");

        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the biggest one");

        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " is the biggest one");

        }

    }
}
