package day36_inheritance.hiding;

public class CallMethods {
    public static void main(String[] args) {
        A obj = new A();
        obj.instanceMethod();

        System.out.println();

        B obj2 = new B();
        obj2.instanceMethod();



    }
}