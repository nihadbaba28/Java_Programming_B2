package day31_custom_classes;

public class Phone {
    String name;
    String brand;
    int memory;
    double version;
    @Override
    public String toString() {
        return "Phone" +
                "\n\tname: " + name  +
                "\n\tbrand: " + brand  +
                "\n\tmemory: " + memory +
                "\n\tversion: " + version ;
    }

   public Phone (String name, String brand){
        this.name = name;
        this.brand = brand;
   }

   public Phone(String name, String brand,int memory,double version){
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
   }

    public Phone(String name){
        this.name = name;
    }

}
