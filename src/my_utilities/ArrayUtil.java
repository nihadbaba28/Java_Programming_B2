package my_utilities;

public class ArrayUtil {
    public static int sumOfArray (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

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
    public static int maxInArray(int[] arr) {
        int max = arr[0];
        for (int eachElements : arr) {
            if (eachElements >= eachElements) {
                max = eachElements;
            }
        }
        return max;
    }

    /**
    *This method accepts an int array and int numb
     *Then check if the number is in the array
     *If yes, return true, otherwise return false
     */

        public static boolean containsInArray(int[] arr, int num){
            for (int i = 0; i < arr.length; i++) {
                if (num == arr[i]){
                    return true;
                }

            }
            return false;

        }
}
