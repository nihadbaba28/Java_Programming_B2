package day08_scanner_logical_operators;

public class SignType {
     /*
         Task:
            Declare and assign a number

            I want to know the sign of the number
                if the number positive
                is the number negative
                is the number 0
     */
    public static void main(String[] args){
        int a = 5;
        boolean isPositive = a > 0;
        boolean isNegative = a < 0;
        boolean isZero = a == 0;

        System.out.println("The number is positive: " + isPositive);
        System.out.println("The number is negative: "+ isNegative);
        System.out.println("The number is zero: " + isZero);

    }

}
