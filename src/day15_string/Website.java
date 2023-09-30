package day15_string;

import java.util.Scanner;

public class Website {
    /*    Task

        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.next(); // www.google.com
        //                            012345678910...
        System.out.println(url.substring(4));
        System.out.println(url.substring(4,10));
        int startPoint = url.indexOf(".") ;
        System.out.println(url.substring(startPoint +1));
        int endPoint = url.indexOf("c") - 1;
        System.out.println(url.substring(startPoint,endPoint));
    }
}
