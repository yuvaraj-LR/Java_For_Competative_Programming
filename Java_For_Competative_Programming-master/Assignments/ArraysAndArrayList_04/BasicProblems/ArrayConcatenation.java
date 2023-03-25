package Assignments.ArraysAndArrayList_04.BasicProblems;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums = {1,2,1,5};
        int[] ans = new int[(nums.length)*2];

        int n = nums.length;
        for(int i = 0; i < 2*n; i++)
        {
            ans[i] = nums[(i+n)%n];
        }

        System.out.println(Arrays.toString(ans));

    }
}
