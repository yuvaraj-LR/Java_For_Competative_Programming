package Sorting;

import java.util.Arrays;

public class SelectionSortInMergeArray {
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }


    public static void sortArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int lastPosition = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastPosition);
            swap(arr, maxIndex, lastPosition);
        }
    }


    public static int[] merge(int arr1[], int arr2[]) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] answerArray = new int[n1 + n2];

        for (int i = 0; i <= answerArray.length - 1; i++) {
            if (i < arr1.length) {
                answerArray[i] = arr1[i];
            } else {
                answerArray[i] = arr2[answerArray.length - i -1];
            }
        }

        sortArray(answerArray);

        return answerArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 9, -4, 0, 12};
        int[] arr2 = {15, -8, 31, 1, 4};

        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
}
