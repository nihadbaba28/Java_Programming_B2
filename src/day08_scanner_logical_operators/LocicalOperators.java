package day08_scanner_logical_operators;

import java.net.ServerSocket;

public class LocicalOperators {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(n > 5);
        System.out.println(n < 10);
        System.out.println(n > 5 && n < 10);  // ---> false, because it says, 20 is more than 5 and 20 is less than 10
        System.out.println( n > 5 || n < 10); // 20 is more than 5 OR 20 is less than 10  ---> true

        // ! ---> negative operator
        System.out.println(!false);
        System.out.println(!true);
        System.out.println(4 != 4);

    }
}
