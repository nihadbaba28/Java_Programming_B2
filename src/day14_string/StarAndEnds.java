package day14_string;

public class StarAndEnds {
    public static void main(String[] args) {
        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));
        System.out.println(str.startsWith("Apple"));
        System.out.println(str.startsWith("e"));
        String str2 = "App";
        System.out.println(str.startsWith(str2));
        String str3 = "  Apple";
        System.out.println(str3.startsWith(str));
        String a = "Apple";
        String b = "    Apple";
        boolean isMatch = b.equals("\tApple");

    }

}
