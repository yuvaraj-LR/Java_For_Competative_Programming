package SourceCode.SortingAlgorthim_07;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1 );
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {8, 7, 3, 9, 2, 3};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
