package Assignments.ArraysAndArrayList_04.BasicProblems;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {6,5,4,8};
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (max > arr[j])
                    count++;
            }
            ans[i] = count;
        }

        System.out.println(Arrays.toString(ans));
    }
}
