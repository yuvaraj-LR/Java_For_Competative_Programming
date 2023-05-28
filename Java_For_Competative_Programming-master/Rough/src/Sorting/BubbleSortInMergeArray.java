package Sorting;

import java.util.Arrays;

public class BubbleSortInMergeArray {
    public static void sortArray(int[] answerArray) {
        for (int i = 0; i < answerArray.length; i++) {
            boolean isSorted = false;
            for (int j = 1; j < answerArray.length - i; j++) {
                if (answerArray[j] < answerArray[j-1]) {
                    int temp = answerArray[j];
                    answerArray[j] = answerArray[j-1];
                    answerArray[j-1] = temp;
                    isSorted = true;
                }
            }

            if (!isSorted) {
                break;
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
