package SourceCode.ArraysAndArrayList_05.Array;

import java.util.Arrays;

public class WaysToPrintArray {
    public static void main(String[] args) {
        byDirectMethod();
        System.out.println();
        byLoopMethod();
        System.out.println();
        byToStringMethod();
    }

    private static void byToStringMethod() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(arr));

    }

    private static void byLoopMethod() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

    private static void byDirectMethod() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print(arr[3]);
    }
}
