package CodingNinja.ArraysAssignment;

import java.util.Arrays;

public class FillZerosInLastPosition {

    public static void convertBackToOriginalArray(int[] arr, int[] temp) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static int[] fillZerosInLastPosition(int[] arr) {

        int n = arr.length;
        int[] temp =  new int[arr.length];
        int i = 0;
        int k = 0;

        while (i < n) {
            if (arr[i] > 0) {
                temp[k] = arr[i];
                k++;
            }
            i++;
        }

        while (k < n) {
            temp[k] = 0;
            k++;
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 0, 0, 1, 9, 0, 8, 0};

        int[] temp = fillZerosInLastPosition(arr);
        convertBackToOriginalArray(arr, temp);

        System.out.println(Arrays.toString(arr));
    }
}
