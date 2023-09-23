package day12_switch_statements;

import java.util.Scanner;

public class FieldTrip {
    /*
Create a class called FieldTrip.
Your school goes on a Field trip each year. The place you go will be based on your grade. Based on the grade level (1-6) figure out the details of your field trip. Print the information at the end.

declare and assign the grade level variable

    only check for the data for valid grades which are only grades values from 1-6. Less than 1 and more than 6 is invalid,
        so print: "Grade must be between 1-6"

    Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith
          grade - 2
        location -  Washing DC
        number of groups - 2
        teacher in charge - Ms. Tom
 */
    public static void main(String[] args) {
        System.out.println("Enter the grade level");
        Scanner input = new Scanner (System.in);
        int gradeLevel = input.nextInt();
        int numberOfGroup = 0;
        String teacherName ="";
        String location = "";
        /*
        if grade---> 1 => grade <= 6
        else ---> "Grade must be between 1-6"
         */

        if(gradeLevel >+ 1&& gradeLevel <= 6){
            if(gradeLevel == 1){
                gradeLevel = 1;
                numberOfGroup =3;
                teacherName = "MS.Smith";
                location = "Apple orchard";
            }  else if (gradeLevel == 2) {
                gradeLevel = 2;
                numberOfGroup = 2;
                teacherName = "Tom";
                location = "Washing DC";

            } else if (gradeLevel == 3) {
                gradeLevel = 3;
                numberOfGroup = 6;
                teacherName ="Tahir";
                location = "Boston";

            } else if (gradeLevel == 4) {
                gradeLevel = 4;
                numberOfGroup = 4;
                teacherName = "Jon";
                location = "Baku";

            } else if (gradeLevel == 5) {
                gradeLevel = 5;
                numberOfGroup = 7;
                teacherName = "Tommy";
                location = "Morristown";

            } else if (gradeLevel == 6) {
                gradeLevel = 6;
                numberOfGroup = 4;
                teacherName = "Gonson";
                location = "Goychay";

            }
            System.out.println("The great level is " + gradeLevel);
            System.out.println("Number of group is " + numberOfGroup);
            System.out.println("The location is " +location);
            System.out.println("Teacher name is " + teacherName);
        } else{
            System.out.println("Grade must be between 1-6");
    }
        }
}
