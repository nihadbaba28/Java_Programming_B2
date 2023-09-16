package day07_relational_operators;

public class UpdateVariable {
    public static void main(String[] args) {
        // how many different way we can add 1
        int a = 10;
        a ++;   // with the help of pre-increment or post-increment

        a = a + 1;
        a = 10 + 1;
        a = 11;

        // how can I add 10 ?
        int b = 4;
        b = 4 + 10;
        b = b + 10;
        b += 10; // same as this one ---> b = b + 10;



        int count = 0;
        count += 5;  // count = count + 5;
        count -= 10; // count = -5
        count *= 2;  // count = count * 2 ---> -5 * 2 = -10.
        count /= 3;  // count = count / 3 = -10 / 3 = -3.
        System.out.println(count);
        count %=2;  // remain is -1
        System.out.println(count);






    }
}
