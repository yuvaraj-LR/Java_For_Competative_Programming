package SourceCode.SortingAlgorthim_07;

import java.util.Arrays;

public class SelectionSort {

    private static void swap(int[] arr, int index, int maxIndex) {
        int temp = arr[index];
        arr[index] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int lastIndex) {
        int max = start;

        for (int i = start; i <= lastIndex; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int lastIndex = n - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, -6, 0, -9, 53};
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
