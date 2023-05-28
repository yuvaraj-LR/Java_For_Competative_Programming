package CodingNinja.ArraysAssignment;

import java.util.Arrays;

public class SumOfArrays {

    public static int[] addArray(int[] arr, int[] arr1, int[] arr2) {

        if (arr1.length == 0) {
            for (int i = arr2.length; i > 0; i--) {
                arr[i] = arr2[i-1];
            }

            return arr;
        }

        if (arr2.length == 0) {
            for (int i = arr1.length; i > 0; i--) {
                arr[i] = arr1[i-1];
            }

            return arr;
        }

        int len = arr.length;
        int n = arr1.length - 1;
        int m = arr2.length - 1;
        int rem = 0;

        for (int i = len - 1; i > 0; i--) {
            int add = rem + arr1[n] + arr2[m];
            if (add > 9) {
                int reminder = add % 10;
                arr[i] = reminder;
                rem = 1;
            }
            else {
                arr[i] = add;
            }
            n--;
            m--;
        }

        if (rem == 1) {
            arr[0] = 1;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7};
        int[] arr2 = { 9, 9, 2};
        int[] answerArray = new int[arr1.length + 1];

        if (arr1.length <= arr2.length) {
            answerArray = new int[arr2.length + 1];
        }



        System.out.println(Arrays.toString(addArray(answerArray, arr1, arr2)));


    }
}
