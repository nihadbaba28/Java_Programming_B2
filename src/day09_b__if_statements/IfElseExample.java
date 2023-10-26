package day09_b__if_statements;

public class IfElseExample {
      /*
        int score = 60;
        if (score >= 75){  // false
            System.out.println("You passed the exam!");
        }

        if (score < 75) {  // true
            System.out.println("You failed!");
        }
     */
      public static void main(String[] args) {
          int score = 80;
          if (score > 75){  // check if body line TRUE, execute the if body
              System.out.println("Passing!");
          } else {  // If the condition in line 18 is FALSE, execute the else body
              System.out.println("Failing!");
          }

      }
}
