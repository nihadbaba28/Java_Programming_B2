package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {4, 10, 30, 100};
        System.out.println(Arrays.binarySearch(nums,4));
        System.out.println(Arrays.binarySearch(nums,10));
        System.out.println(Arrays.binarySearch(nums,100));

    }
}
