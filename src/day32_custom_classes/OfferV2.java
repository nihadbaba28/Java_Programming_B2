package day32_custom_classes;

import java.util.Arrays;

public class OfferV2 {
    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPTo;

    public OfferV2(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public OfferV2(String company, String location, double salary, boolean isFullTime, int numberOfPTo) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTo = numberOfPTo;
    }


    public String toString(){
    return  company + " located in " + location +
    "\nPays $" + salary + " salary and provides " +
     numberOfPTo + " number of PTO " +
     "\n this is fulltime job: " + isFullTime;
    }

}
