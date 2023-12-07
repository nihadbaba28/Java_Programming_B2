package day38_a_abstraction_interface.animal;

import day38_a_abstraction_interface.language.Language;

public class Parrot extends Bird implements Flyable, Language {
    public void eat(){
        System.out.println("Parrots eat with their beaks");
    }
    public void fly(){
        System.out.println("Parrot fly very good");
    }

    @Override
    public void hi() {

    }

    @Override
    public void bye() {

    }
}
