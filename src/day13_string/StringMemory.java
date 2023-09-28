package day13_string;

public class StringMemory {
    public static void main(String[] args) {
        int num = 4;
        byte num2 = 5;
        char letter = 'f';
        boolean result = true;
        double num3 = 34.5;
        String str = "Hello"; // creating a  String by LITERALS
        String str2 = new String("Hello"); // Creating string by 'new' keyword



        String first = "java";  // String literal ---> is goes to Heap Pool

        String second = new String("java");  // String object (String by new keyword) ---> directly in Heap
        String third = "java";
        String forth = new String("java");


        System.out.println(first == second);
        System.out.println(first == third);
        System.out.println(second == forth);
    }
}
