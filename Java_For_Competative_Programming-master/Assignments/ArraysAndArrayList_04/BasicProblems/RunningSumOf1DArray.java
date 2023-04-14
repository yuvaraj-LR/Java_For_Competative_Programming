package Assignments.ArraysAndArrayList_04.BasicProblems;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 20, 3, 4, 50};
        int[] ans = new int[nums.length];
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            int n  = nums[i] + total;
            ans[i] = n;
            total += nums[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
