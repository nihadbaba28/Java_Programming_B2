package day09_b__if_statements;

public class SingleIfExamples {
    public static void main(String[] args) {
        if(5>6){
            System.out.println("Hello World!");  // since our condition false, the body of the if statement ( or code of if statement) is skipped.

        }
        System.out.println("Second line");
        int year = 2023;
        boolean isLockDown= year == 2020 || year == 2021;

        if (!isLockDown){
            System.out.println("Party");
            System.out.println("Tis is not a normal party, it is Java party");
            System.out.println("Travel");
        }

        year = 2023;
        boolean notLockDown = year > 2021;
        if (notLockDown) {
            System.out.println("Party");
            System.out.println("Tis is not a normal party, it is Java party");
            System.out.println("Travel");

        }
    }
}
