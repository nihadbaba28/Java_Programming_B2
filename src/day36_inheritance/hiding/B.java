package day36_inheritance.hiding;

public class B extends A {
    @Override
    public void instanceMethod(){
      staticMethod();
        System.out.println("Instance method from child class");

    }

    public static void staticMethod (){

    }
}
