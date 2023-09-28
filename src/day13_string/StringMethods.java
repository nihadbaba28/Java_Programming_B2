package day13_string;
// import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        String str = "loop camp"; // IMMUTABLE
        str = str + " is nice";  // we made a completely new String
        String name = "Nihad";
        System.out.println(name == "Nihad");
        System.out.println(name.equals("Nihad"));
        String  name2 = new String("Nihad");
        System.out.println(name2 == "Nihad");
        System.out.println(name2.equals("Nihad"));

        boolean result = name2.equals("Nihad");

        System.out.println(name.equalsIgnoreCase("nihad"));

        System.out.println("--------------------");

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.length());

    }

}
