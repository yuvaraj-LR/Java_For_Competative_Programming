package Assignments.ArraysAndArrayList_04.BasicProblems;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int n = 3;
        int[] ans = new int[n * 2];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 != 0)
                ans[i] = nums[i/2];
            else
                ans[i] = nums[n + (i/2)];
        }
        System.out.println(Arrays.toString(ans));
    }
}
