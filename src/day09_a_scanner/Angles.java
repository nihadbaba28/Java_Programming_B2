package day09_a_scanner;
import java.util.Scanner;
public class Angles {

    public static void main(String[] args) {
     System.out.println("Enter three angle degree: ");
     Scanner input = new Scanner(System.in);
     double angleOne = input.nextDouble(), angleTwo = input.nextDouble(), angleThree = input.nextDouble();
     double sum = angleOne + angleTwo + angleThree;
     boolean isTriangle = sum == 180;
     boolean isCircle = sum == 360;
        System.out.println("It is a triangle: " + isTriangle);
        System.out.println("It is a circle: " + isCircle);
    }
}
