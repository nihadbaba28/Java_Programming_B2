package day14_string;

public class RecapMethods {
    public static void main(String[] args) {
        String s = "pen"; // s is aString literal,  it is in the String Pool
        String s2 = new String("pen"); // s2 is object in the heap, because we used "new" keyword
        System.out.println("compare with == " + (s == s2));
        System.out.println("compare equals. " + (s.equals(s2) )); //compare the value to be EXACT same

        s = "Pen";
        String ss = "pen";
        boolean isSame = s.equalsIgnoreCase(ss);
        if(isSame){
            System.out.println("Hello");
        }
        ss = "Peen";
        boolean isItSame = s.equalsIgnoreCase(ss);
        if(isItSame){
            System.out.println("hi");
        }
        System.out.println(ss.length());
        int a = s.length();
        boolean isTrue = ss.length() > s.length();
        System.out.println(isTrue);
        if (s.length() < 5){
            System.out.println("short word");
        } else {
            System.out.println("long word");
        }
}
}
