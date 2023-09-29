package day14_string;

public class Contains {
    public static void main(String[] args) {
        String day = "Today it was a Java class.";
        System.out.println(day.contains("it was"));
        System.out.println(day.contains("itwas"));
        String str = "was a SoftSkills";
        System.out.println(day.contains(str));
        System.out.println(day.contains("Today class"));  // it is false,because it have to be e
        System.out.println(day + " Or not");
        System.out.println(day.contains(" Or not."));
        System.out.println((day + " Or not.").contains(" Or not."));
    }
}
