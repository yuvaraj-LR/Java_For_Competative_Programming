package SourceCode.ArraysAndArrayList_05;

import java.util.Arrays;

public class PassingValuesInArray {
    public static void main(String[] args) {
        int[] arr = {12, 54, 85, 21, 76};
        System.out.println(Arrays.toString(arr));
        changeValues(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void changeValues(int[] a) {
        a[2] = 20;
    }

}
