package day37_a_abstraction.exercise;

public class Running extends  Exercise{
    String name;
    public Running(){
       super("Running");
    }
    public void performExercise(){
        System.out.println("Running on treadmill");
    }
    public void generalInfo(){
        System.out.println(name + " exercise is better for your health");
    }

}
