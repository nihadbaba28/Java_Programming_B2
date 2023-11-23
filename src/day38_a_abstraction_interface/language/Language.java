package day38_a_abstraction_interface.language;

public interface Language {
    String PLANET = "Earth"; // This is not instance
    /*
    In interface the variable is public final static, constance.
     */
    void hi();
    void bye();
}
