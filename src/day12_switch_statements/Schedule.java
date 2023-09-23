package day12_switch_statements;

import java.util.Scanner;

public class Schedule {
    /*
 Task:

    Ask the user to enter which day it is
    print which class we have on that day, and the time of the class

    topic with instructor at time

    challenge:
        make each day flexible

            monday
            Monday
            mon

         reduce repeating code

 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day is it and what it is about? ");
        String day = input.next();
        String result = "";
        switch (day){
            case "Monday":
                result = "No classes for now, but it will be start.\nIt will be mentor sessions from 7pm-10pm EST";
                break;
            case "Tuesday":
                result = "No classes.Champions league doing Java tasks";
                break;
            case "Wednesday":
            case "Thursday":
            case "Saturday":
                result = "Java lessons";
                break;
            case "Friday":
                result = "we don't have lesson";
                break;
            case "Sunday":
                result = "It is fun day";
                break;
        }
        System.out.println(result);
    }

}
