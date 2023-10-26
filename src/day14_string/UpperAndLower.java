package day14_string;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "LooPCamP";

        System.out.println(str);
        System.out.println(str.toLowerCase());  // it will make the String value to be in a lowercase.

        str = str.toLowerCase();
        System.out.println(str);

        str = "LooPCamP";
        ;
        System.out.println(str.toUpperCase());
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);


        System.out.println("-------------------");


        String word = "HELLO";
        String word2 = word + " WORLD";
        System.out.println(word2);
        System.out.println(word);
    }}