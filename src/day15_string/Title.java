package day15_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String url = input.next();
        url = url.toLowerCase();
        System.out.print("Enter your name with with title: ");
        String name = input.next();
       String msg = "";
        if(url.startsWith("www.") && url.endsWith(".com")){
            msg = name + " You entered URL which is " + url;
        } else if (!url.startsWith("www.")) {
            msg = "URL should start with \"www.\"";
        } else if (!url.endsWith(".com")) {
            msg = "URL should end with \".com\"";
        }
        System.out.println(msg);
    }
}
