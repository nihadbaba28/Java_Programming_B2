package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your browser: ");
        String browser = input.nextLine();

        System.out.print("Enter your URL: ");  // URL ---> it is a line in browser
        String url = input.nextLine();
        switch (browser){
            case "chrome":
                System.out.println("Opening " + url + " in the " + browser + " browser");
                break;
            case "Edge":
                System.out.println("Opening " + url + " in the " + browser + " browser");
                System.out.println("Welcome!");
                break;
            case "Safari":
                System.out.println("Opening " + url + " in the " + browser + " browser");
                System.out.println("Welcome !");
                break;
            default:
                System.out.println(browser + " is not valid browser type");

        }
    }
}
