package day37_a_abstraction.exercise;

public abstract class Exercise {
    String name;
    public Exercise(String name){

    }

    public abstract void performExercise();

    public void generalInfo(){
        System.out.println("Exercise is better for your health");
    }
}
