package day12_switch_statements;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // ils-if statement
        if (n ==1) {
            System.out.println("One");

        } else if (n == 2) {
            System.out.println("Two");
        } else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("Four");

        } else if (n == 5) {
            System.out.println("Five");
        } else if (n == 6) {
            System.out.println("Six");
        } else {
            System.out.println("Invalid number");
        }

        switch (n){  // char, byte, short, int, String | It will not work with boolean expression
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("No valid number");


        }
    }
}
