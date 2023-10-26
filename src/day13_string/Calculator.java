package day13_string;

import java.util.Scanner;

public class Calculator {
    /*
declare and assign 2 number variables
declare and assign a char variable for an operator

create a calculator based on the operator picked
    + : add num1 and num2
    - : minus num1 and num2
    * : multiply num1 and num2
    / : divide num1 and num2
    any other char: "invalid operator"
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = input.nextInt();
        System.out.println("enter second number");
        int num2 = input.nextInt();

        System.out.println("pick operator: \n\t+\n\t-\n\t*\n\t/\n\t%");
        String operator = input.next();
        int result = 0;
        boolean runOrNot = true;
        switch (operator){
            case "+":
            case "plus":

               result =num1 + num2;
                break;
            case "-":
            case "minus":

                result =num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("no valid number");
                runOrNot = false;
        }
        if(runOrNot){
        System.out.println("\nYou entered numbers which are " + num1 + " and " + num2 + "\n\tThe result is " + result + " by " +operator + " operator");
    }

} }
