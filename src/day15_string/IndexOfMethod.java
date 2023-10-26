package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "pen";
        System.out.println(str.indexOf("b"));
        System.out.println(str.indexOf("en"));
        String str2 = "Campinggroundcamp";
        System.out.println(str2.indexOf("camp")); // java takes first char's index
    }
}
