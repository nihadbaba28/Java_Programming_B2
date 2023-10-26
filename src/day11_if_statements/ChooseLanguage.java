package day11_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
        /*
        ask the user to enter a number based on the language they wanted to use.
        1 - English
        2 - Spanish
        3 - Turkish
        4 - Russian
        5 - French
        6 - Azerbaijan

        based on the number they picked print a message:

        1 : "hello, thanks for your call"
        2 : "hola, gracias para llamar"
        3 : "merhaba, aradiginiz icin tesekkurler"
        4 : "privet, spasibo za vash zvonok"
        5 : "Merci ,pour votre appel"
        6 : "salam, zeng ettiginiz ucun mennatdariq"
        any other number: "We will use English by default"
     */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Please choose option below: \n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\tYour choice: ");

            int  userOption = input.nextInt();
            String message = "";
            if(userOption == 1){
                message = "hello,thanks for your call";
            } else if(userOption == 2){
                message = "holla";
        } else if(userOption == 3){
                message = "salam elyki qardash";
            };
            System.out.print(message);


}}
