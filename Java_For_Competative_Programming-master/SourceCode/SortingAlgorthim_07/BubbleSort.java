package SourceCode.SortingAlgorthim_07;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {97, 98, 41, 63, 55};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

//        This loop is running for place the element in right position.
        for (int i = 0; i < n; i++) {
//        To check if the array was sorted or not.
            boolean isSorted = false;
//            To find the greatest element and push over last.
            for (int j = 1; j < n-i; j++) {
//                Check whether the actual element is smaller than the previous one.
                if (arr[j] < arr[j-1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSorted = true;
                }
            }

            if (!isSorted) {
                break;
            }
        }
    }
}
