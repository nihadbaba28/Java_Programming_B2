package day38_a_abstraction_interface.language;

public class Translator {
    public static void main(String[] args) {

        Spanish obj = new Spanish();
        obj.hi();
        obj.bye();

        Azerbaijani obj1 = new Azerbaijani();
        obj1.hi();
        obj1.bye();

    }
}