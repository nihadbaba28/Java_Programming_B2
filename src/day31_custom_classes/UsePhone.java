package day31_custom_classes;

public class UsePhone {
    public static void main(String[] args) {


        Phone phone1 = new Phone("Iphone X");
        System.out.println(phone1);

        Phone phone2 = new Phone("Iphone 14","Apple");
        System.out.println(phone2);

        Phone phone3 = new Phone("Iphone 12","Apple",512,20.00);
        System.out.println(phone3);
    }
}