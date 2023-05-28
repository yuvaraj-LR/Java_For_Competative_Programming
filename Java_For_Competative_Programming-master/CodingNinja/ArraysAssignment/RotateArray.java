package CodingNinja.ArraysAssignment;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] arr, int d) {
        //Your code goes her

        // No. of Rotation
        for (int i = 1; i <= d; i++) {
            // For Swapping the Elements
            for (int j = 1; j < arr.length; j++) {
                int temp = arr[j];
                arr[j] = arr[j -1];
                arr[j - 1] = temp;
            }
        }
    }

    public static void reverseArray(int[] arr, int first, int last) {

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }

    public static void rotate2 (int[] arr, int d) {
        int n = arr.length;
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, n-d-1);
        reverseArray(arr, n-d, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        rotate(arr, 7);

        int[] arr1 = {1, 2, 3, 4, 5};
        rotate2(arr1, 2);
        System.out.println(Arrays.toString(arr1));
    }
}
