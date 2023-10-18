package day21_arrays;

import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many friend do you hava ? ");
        int friendNum = input.nextInt();
        String [] friendList = new String [friendNum];

        for (int i = 0; i < friendNum; i++) {
            System.out.print("Enter your friend name: ");
            String name = input.next();;
            friendList[i] += name;
        }
    }
}
