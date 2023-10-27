package day26_methods;

import java.util.Arrays;

public class MinNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 45, 23, 56, 87, 56};
    }

    public static int minInArray1(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int minInArray2(int[] arr) {
        int min = arr[0];
        for (int eachElements : arr) {
            if (eachElements <= eachElements) {
                min = eachElements;
            }
        }
        return min;
    }
}