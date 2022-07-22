package SourceCode.ArraysAndArrayList_05;

import java.util.Arrays;

public class SwappingOfIndexes {
    public static void main(String[] args) {
        int[] arr = { 12, 52, 81, 97, 86};
        swap(arr, 2, 4);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index_1, int index_2){
        int temp = arr[index_1];
        arr[index_1] = arr[index_2];
        arr[index_2] = temp;

    }
}
