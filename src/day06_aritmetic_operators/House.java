package day06_aritmetic_operators;

public class House {
     /*
    Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
     */
    public static void main(String[] args){
        String house = "Single house";
        int numberOfBedroom = 5;
        int numberOfBathroom = 3;
        int numberOfKitchen = 2;
        boolean hasBasement = true;
        boolean hasAttic = false;
        boolean isOnSale = false;
        double price = 9999999.99; // we can do like that ----> 9_999_999.99 to make more readable
        String address = " 123 Central Park";
        int zipcode = 12321;
        boolean hasPark = true;
        double rating = 4.8;

        String result = "The " + house + "on" + address + "," + zipcode + " costs " + price +" The" +house + " has" + numberOfBedroom + " bedrooms, has" +numberOfBathroom +" bathroom, and has " +numberOfKitchen + " kitchen.";

        System.out.println(result);
        System.out.println(result);
        System.out.println("Here is results: = " + result);


    }







}
