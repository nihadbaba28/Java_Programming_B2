package day08_scanner_logical_operators;

public class ShortCircuit {
    /*
    &&

    ---------

    True && True ---> True
    True && False ---> False
    False && True ---> False

     */
    public static void main(String[] args) {


//        System.out.prinln(false && (a++ > 11));
//        System.out.prinln(false & (a++ > 11));  // ---> if we use && and first part is false Java does not care about second part and doesn't run a++
//        // if we want run a++ we have tu use & instead of &&

        System.out.println(5 > 4 | 7 < 3);
    }
}