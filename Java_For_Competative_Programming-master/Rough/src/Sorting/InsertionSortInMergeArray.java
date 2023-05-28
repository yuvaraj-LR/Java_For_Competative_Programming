package Sorting;

import java.util.Arrays;

public class InsertionSortInMergeArray {

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void sortArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }

    }

    public static int[] merge (int[] arr1, int[] arr2) {
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
