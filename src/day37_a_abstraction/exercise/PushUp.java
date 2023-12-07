package day37_a_abstraction.exercise;

public class PushUp extends Exercise {
    String name;

    public PushUp() {
        super("PushUp");
    }

    public void performExercise() {
        System.out.println("Doing push up carpet");
    }

    public void generalInfo() {
        System.out.println(name + " exercise is better for your health");
    }
}
