package Assignments.ArraysAndArrayList_04.BasicProblems;

import java.util.Arrays;

public class UniqueIntegerSumUptoZero {
    public static void main(String[] args) {
        int num = 5;
        int[] result = new int[num];
        int mid = num/2;

        for (int i=0; i<mid; i++) {
            int n = i+1;
            result[i] = n;
            result[num-1-i] = -n;
        }

        System.out.println(Arrays.toString(result));
    }
}
