package day06_aritmetic_operators;

public class Store {
    public static void main(String[]  args){

        String store = "Target";
        int numOfTv = 100;

        System.out.println("Person comes into the store and they bought a TV");
        //numOfTv = numOfTv - 1
        System.out.println("Number of TV now: " + --numOfTv);

        System.out.println("First person has returned TV");
        System.out.println("Number of TV " + --numOfTv);


    }
}
