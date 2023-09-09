package day06_aritmetic_operators;

public class CastingExample {
    public static void main(String[] args) {
        short numOne = 40;
        float numTwo = numOne;  // short is smaller than float, so implicit casting happens.
        System.out.println(numOne);
        System.out.println(numTwo);

        float num3 = 100.5F;
        short num4 = (short) num3;

        System.out.println(num3);
        System.out.println(num4);

        short num5 = 90;
        float num6 = num5;

        System.out.println(num6);

        char letter = 'A';
        int letterInt = letter;


    }
}