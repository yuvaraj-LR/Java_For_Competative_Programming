package SourceCode.SortingAlgorthim_07;

import java.util.Arrays;

public class CyclicSort {

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 4, 1, 5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
