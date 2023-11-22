package day37_a_abstraction.cars;

public class Garage {
    public static void main(String[] args) {
      //  Car obj = new Car(); -> we can't make object from abstract class
        Toyota obj2 = new Toyota();
        obj2.start();
        System.out.println();

        Honda obj3 = new Honda();
        obj3.start();
        System.out.println();
        Tesla obj4 = new Tesla();
        obj4.start();
        obj4.charge();
        //Tesla is first NON-ABSTRACT class
        //It has to implement all parent or grandparent class methods
    }
}
