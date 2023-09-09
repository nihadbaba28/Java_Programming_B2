package day06_b_unary_operators;

public class IncrementExamples {
    public static void main(String[] args) {

        int x = 0;
        System.out.println(x);   //0

        x = x + 1;   // take the value of x, which is 0 and add 1 ---> 1

        System.out.println(x);    // 1
        // In Java there is a short way to write x+1 in two options: POST-INCREMENT and PRE-INCREMENT
        // POST-INCREMENT
        x ++; // this will increase the value by 1

        System.out.println(x);   //2

        x++;
        System.out.println(x);  //3

        //PRE-INCREMENT
        ++x;   // take the value of x, which is 0 and add 1 --->  x = x+1; ---> 3 + 1 = 4
        // Q: what is the different ?
        System.out.println(++x);  // PRE-INCREMENT - it will update x first and then print

        System.out.println(x++);  // POST-INCREMENT - it prints first and then update the x

        System.out.println(x); // it's gonna be 6 because has already updated.





    }


}
