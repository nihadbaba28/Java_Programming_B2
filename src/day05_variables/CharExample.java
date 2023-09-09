package day05_variables;

public class CharExample {
    public static void main(String[] args) {

        // assign characters to the char data type

        char letterOne = 'a' ;
        char letterTwo = 'Z' ;
        char numberOne = '9' ;
        char specialOne = '$' ;

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo);

        char letterThree = 65;
        System.out.println(letterThree);
        System.out.println(letterThree+letterThree);
        // char letterFour = '65'; // this is invalid because there are two characters

        System.out.println(letterOne + " " + letterThree +   numberOne + numberOne);




    }
}
