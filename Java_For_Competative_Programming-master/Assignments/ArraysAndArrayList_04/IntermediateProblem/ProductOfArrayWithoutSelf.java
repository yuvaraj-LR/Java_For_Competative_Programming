package Assignments.ArraysAndArrayList_04.IntermediateProblem;

import java.util.Arrays;

public class ProductOfArrayWithoutSelf {
    public static void main(String[] args) {
        int[] nums = {0, 4, 0};
        int[] ans = new int[nums.length];

        myTry(nums, ans);
        actualMethod(nums, ans);
    }

    private static void actualMethod(int[] nums, int[] ans) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;

        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        System.out.println(Arrays.toString(res));
    }


    private static void myTry(int[] nums, int[] ans) {
        if (nums.length >= 2) {
            int num1 = nums[0];
            int num2 = nums[1];
            ans[0] = num2;
            ans[1] = num1;

            for (int i = 0; i < nums.length; i++) {
                int total = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        ans[i] = total * nums[j];
                        total = ans[i];
                    }

                }
            }

            System.out.println(Arrays.toString(ans));
        }
    }
}
