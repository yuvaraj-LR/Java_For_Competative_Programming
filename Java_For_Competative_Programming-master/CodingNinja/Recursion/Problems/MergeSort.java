package CodingNinja.Recursion.Problems;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 1, 6, 2, 9, 4, 64};
        mergeSort(arr);

        System.out.println(Arrays.toString(arr));

//        int[] arr1 = splitArray(arr, 0, arr.length / 2);
//        int[] arr2 = splitArray(arr, (arr.length / 2), arr.length - 1);
//
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
    }

    public static void merge(int[] s1, int[] s2, int[] d) {
        int i = 0, j = 0, k = 0;
        while (i < s1.length && j < s2.length) {
            if (s1[i] < s2[j]) {
                d[k] = s1[i];
                i++;
                k++;
            } else {
                d[k] = s2[j];
                j++;
                k++;
            }
        }

        if (i < s1.length) {
            while (i < s1.length) {
                d[k] = s1[i];
                i++;
                k++;
            }
        }

        if (j < s2.length) {
            while (j < s2.length) {
                d[k] = s2[j];
                j++;
                k++;
            }
        }
    }

    public static void mergeSort(int[] a) {
        if (a.length <= 1) {
            return;
        }

        int[] b = new int[a.length / 2];
        int[] c = new int[a.length - b.length];

        for (int i = 0; i < a.length / 2; i++) {
            b[i] = a[i];
        }

        for (int i = a.length / 2; i < a.length; i++) {
            c[i - a.length / 2] = a[i];
        }

        mergeSort(b);
        mergeSort(c);
        merge(b, c, a);
    }
    public static int[] splitArray(int[] arr, int start, int end) {
        int[] ARR = new int[arr.length];

        if (end % 2 == 0) {
            ARR = new int[arr.length / 2 - 1];
        } else {
            ARR = new int[arr.length / 2];
        }

        int i = 0;

        while (start < end) {
            ARR[i] = arr[start];
            start++;
            i++;
        }

        return ARR;
    }
}
