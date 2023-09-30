package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));
    }
}
