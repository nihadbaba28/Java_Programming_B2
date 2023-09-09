package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {
        System.out.println("There is not tabbed");
        System.out.println("\tThere is  tabbed"); // this is tabbed one time
        System.out.println("\t\tThere is  tabbed"); // this is tabbed two times

        // The followings are about \n- new line
        System.out.println("1) Go to store");
        System.out.println("2) grab milk");
        System.out.println("3) pay cashier");


        System.out.println("\n1)Go to store\n2)grab milk\n3)pay cashier");

        System.out.println(4+5);
        System.out.println("Total price " + (4+5) );
    }

}
