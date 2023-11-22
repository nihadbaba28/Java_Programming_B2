package day37_a_abstraction.cars;

public class Tesla extends ElectricCar{

    public void charge(){
        System.out.println("Charging tesla");
    }
    public  void start(){
        System.out.println("Start remotely");
    }
}
