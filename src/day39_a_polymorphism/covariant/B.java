package day39_a_polymorphism.covariant;


import day39_a_polymorphism.animal.Animal;

public class B extends A {

    //A method that returns A can be overridden as a method that return B since B is a A
    @Override
    public B test() {
        return new B();
    }


    @Override
    public void test2 () {
        System.out.println("Overrided in child");
    }
}