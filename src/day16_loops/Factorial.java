package day16_loops;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int result = 1;
        while (num >=1){
            result *= num;
            num --;
        }
        System.out.println(result);
    }
}
