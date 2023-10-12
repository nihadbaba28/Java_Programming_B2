package day19_nested_loops;

public class BiggestString {
    public static void main(String[] args) {
        //Find the longest same characters
        /*
        loop through and get each character
            store that into a new String -- aaa
         */
        String str = "aaabbbcccccdddeee";
        String sub = "";
        String biggest = "";
        for (int i = 0; i < str.length() - 1; i++) {

            sub += str.charAt(i);
            if(str.charAt(i) != str.charAt(i + 1)){
                if(biggest.length() < sub.length()){
                biggest = sub;
            }
                sub = "";
        }
    }
        System.out.println(biggest);
    }}
