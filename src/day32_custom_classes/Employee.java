package day32_custom_classes;

public class Employee {
    String name;
    int id;
    String jobTitle;
    double salary;
    public Employee(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
    }
    public Employee(String name, int id, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }
    public String toMeeting(String name){
        return name + " is going to meeting";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
