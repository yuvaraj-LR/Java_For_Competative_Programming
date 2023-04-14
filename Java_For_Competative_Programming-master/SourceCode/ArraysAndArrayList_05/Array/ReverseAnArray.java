package SourceCode.ArraysAndArrayList_05.Array;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 12, 52, 81, 97, 86};
        reverseAnArray(arr);
    }

    static void reverseAnArray(int[] arr) {
        int startingIndex = 0;
        int endingIndex = arr.length-1;

        while (startingIndex < endingIndex) {
            swap(arr, startingIndex, endingIndex);
            startingIndex++;
            endingIndex--;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index_1, int index_2){
        int temp = arr[index_1];
        arr[index_1] = arr[index_2];
        arr[index_2] = temp;

    }
}
