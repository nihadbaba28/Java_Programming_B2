package day15_string;

import java.util.Scanner;

public class LongestWithA {
    /*
create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

Ex:
    "java"
    "mouse"
    "computer"

Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordTree = input.next();

        int num1 = wordOne.length();
        int num2 = wordTwo.length();
        int num3 = wordTree.length();
        String result = "";
      if(wordOne.contains("a") && wordTwo.contains("a") && wordTree.contains("a")) {
          if (num1 >=  num2 && num1 >= num3){
              result = "biggest is : " +wordOne;
          } else if (num2 >= num1 && num2 >= num3) {
              result = " biggest is: " + wordTwo;
          } else if (num3 >= num1 && num3 >= num2) {
              result = "biggest is: " +wordTree;
          }} else if (wordOne.contains("a") && wordTwo.contains("a")) {
              if (num1 >= num2){
                  result ="biggest is: " +wordOne;
              }
              if (num2 >= num1){
                  result = "biggest is: " +wordTwo;
              }
          } else if (wordOne.contains("a") && wordTree.contains("a")) {
              if (num1 > num3){
                  result = "biggest is: " +wordOne;
              }
              if (num3 > num1){
                  result = "biggest is: " +wordTree;
              }
          } else if (wordTwo.contains("a") && wordTree.contains("a")) {
              if (num2 > num3)
                  result = "biggest is: " +wordTwo;

          if (num3 >= num2){
              result = "biggest is: " +wordTree;
          }}
        if (wordOne.contains("a")){
            result = "biggest is: " +wordOne;
        }
        if (wordTwo.contains("a")){
        result = "biggest is: " +wordTwo;
      }
        if (wordTree.contains("a")){
            result = "biggest is: " +wordTree;
        }
        System.out.println(result);


        System.out.println("-------------------");

        if(!wordOne.contains("a"));


    }}


