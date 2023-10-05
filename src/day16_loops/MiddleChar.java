package day16_loops;

public class MiddleChar {
    public static void main(String[] args) {
        /*
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.    b) If the length of the string is odd there will be one middle character.
        Ex:
        Input: elephant
        Output: The middle characters: ph
*/
        String str = "abcdef";
        int mid = str.length() / 2;  // 6 / 2 = 3

        if (str.length() % 2 == 0){
            char firstMiddleChar = str.charAt(mid - 1);
            char secondMiddleChar = str.charAt(mid);
            System.out.println("" + firstMiddleChar + secondMiddleChar);

        }else {
            char middle = str.charAt(mid);
            System.out.println("middle = " + middle);
        }


    }
}
