package day39_a_polymorphism.book;

public class JavaTextBook extends EBook{

    public JavaTextBook(String name){
        super.name = name;
    }
    public void read(){
        System.out.println("Reading Java Text Book");
    }
    public void download(){
        System.out.println("Downloading Java Text Book");
    }
    public void open(){
        System.out.println("Opening Java Text Book");
    }
    boolean isFun;
}
