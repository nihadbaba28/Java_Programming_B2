package day06_aritmetic_operators;

public class TypeCasting {
    public static void main(String[] args){
        byte b = 40;
        int i = b; // byte value is automatically converted to int because byte is smaller than int
        System.out.println(b);
        System.out.println(i); // we are not chancing the data type of b. we are chancing the data type of value we are assigning to i taking i from b

        int i2 = 100;
        byte b2 = (byte)i2; // int is bigger than byte, so we must cast it. We can the int type -i2 to a byte type using (byte)

        int i3 = 500;
        long l1 = i3;

        long l2 = 200;
        int i4 = (int)l2;

        double d = 50; // System.out.println(d); //50.0
        int i5 = (int)d;
        System.out.println(i5);

        double d2 = 40;
        byte b3 = (byte) d2;
        System.out.println(b3);

        // with the numbers outside the range. DATA LOSS
        int i6 = 200;
        byte b4 = (byte)i6;
        System.out.println(i6);
        System.out.println(b4);

        double d3 = 45.56;
        int i7 = (int)d3;
        System.out.println(d3);
        System.out.println(i7);







    }
}
