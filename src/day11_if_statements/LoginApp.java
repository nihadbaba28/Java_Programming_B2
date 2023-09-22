package day11_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        /*
inputs:
    declare and assign a 4 digit pin code
    declare and assign the last 4 digits of ssn: 1234

    declare and assign expected values for both
        example expected:
            pin: 1552
            ssn: 1234

outputs:

        when the pincode and ssn match the expected print:
            Authentication successful

        when the pincode or ssn are not correct print:
            Authentication failed

        when the pincode was not correct print:
            incorrect pin code

        when the ssn is not correct print:
            invalid ssn
 */
        int myPincode = 1234;
        int mySSN = 8213;
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome!\n\tPlease enter your pin-code: ");
        int enterPincode = input.nextInt();

        System.out.println("Please, enter last 4 digits of your SSN: ");
        int enterSSN = input.nextInt();

        if (myPincode == enterPincode && mySSN == enterSSN){
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
        }
        if(myPincode != enterPincode && mySSN != enterSSN){
            if(myPincode != enterPincode){
                System.out.println("incorrect pin code");}
                if (enterSSN != mySSN) {
                    System.out.println("invalid ssn");
                }
            }



    }
}
