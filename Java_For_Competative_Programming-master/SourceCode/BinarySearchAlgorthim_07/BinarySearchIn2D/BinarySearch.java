package SourceCode.BinarySearchAlgorthim_07.BinarySearchIn2D;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {21, 31, 41, 51},
                {32, 42, 52, 62},
                {43, 53, 63, 73}
        };

        System.out.println(Arrays.toString(search(arr, 27)));
    }

    static int[] search(int[][] arr, int target) {
        int low = 0;
        int high = arr.length-1;

        while (low < arr.length && high >= 0) {
            if (arr[low][high] == target) {
                return new int[]{low, high};
            }

            if (arr[low][high] < target) {
                low++;
            } else {
                high--;
            }
        }

        return new int[]{-1, -1};


    }
}
