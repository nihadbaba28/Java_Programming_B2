package day39_a_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {
        Lizard lizard = new Lizard();
        lizard.eat();
        lizard.name = "lizard";
        lizard.numberOfClaws = 10;
        lizard.skinColor = "camo";
        System.out.println(lizard.name);
        System.out.println(lizard.numberOfClaws);
        System.out.println(lizard.skinColor);



        Reptile reptile = new Lizard();
        reptile.eat();
        reptile.name = "reptile";
        reptile.numberOfClaws = 10;
        System.out.println(reptile.name);
        System.out.println(reptile.numberOfClaws);

        System.out.println();

        Animal animal = new Lizard();
        animal.eat();
        animal.name = "animal";


    }
}
