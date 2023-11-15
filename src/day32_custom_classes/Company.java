package day32_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Nihad","engineer");

        System.out.println(emp1);
        Employee emp2 = new Employee("Nihad", 101, "QA specialist", 10_000);
        System.out.println(emp2);
        emp2.salary = 12_000;
        System.out.println(emp2);
        emp2.toMeeting(emp2.name);
    }
}
